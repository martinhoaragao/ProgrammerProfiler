import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreCalculator {

    private final HashMap<String, PMDRule> pmdrules;
    private ArrayList<Metric> metrics;
    private Map<String, Float> skill, readability;
    private final ProjectMetrics baseSolution;
    private final ArrayList<ProjectMetrics> exampleSolutions;

    public ScoreCalculator(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions, HashMap<String, PMDRule> pmdrules) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
        this.pmdrules = pmdrules;
    }

    void loadMetrics() throws FileNotFoundException { //Load PP Metrics
        final Type METRIC_TYPE = new TypeToken<List<Metric>>(){}.getType();
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("AuxFiles/metrics.json"));
        metrics = new ArrayList<>(gson.fromJson(reader, METRIC_TYPE));
    }

    void calculateScore() throws InvocationTargetException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException {
        skill = new HashMap<>();
        readability = new HashMap<>();
        Class<?> c = Class.forName("ProjectMetrics");
        for (ProjectMetrics pm : exampleSolutions) {
            skill.put(pm.getProjectName(), (float) 0);
            readability.put(pm.getProjectName(), (float) 0);
        }
        for (Metric m : metrics) {
            System.out.println("\n" + m.getMethodName() + ": " + m.getThis() + " -> " + m.getImplies() + "\nPriority: " + m.getPriority());
            calcForMetric(c, m);
        }
        System.out.println("\nPre-PMD Results:\nSkill  : " + skill.toString());
        System.out.println("Readability: " + readability.toString());
        System.out.println("\nPMD Results (higher is worst): ");
        for (ProjectMetrics pm : exampleSolutions) {
            String pName = pm.getProjectName();
            int s = calculateScore(pm, 'R'); //Skill (Not R)
            int r = calculateScore(pm, 'S'); //Readability (Not S)
            System.out.println(pm.getProjectName() + ": Skill=" + s + "   Readability: " + r);
            skill.put(pName, skill.get(pName) - s);
            readability.put(pName, readability.get(pName) - r);
        }int avgs, avgr = avgs = 0;
        for (String key : skill.keySet()) {
            skill.put(key, round(skill.get(key)));
            avgs += skill.get(key);
        }
        for (String key : readability.keySet()) {
            readability.put(key, round(readability.get(key)));
            avgr += readability.get(key);
        }
        System.out.println("\nFinal Results:\nSkill  : " + skill.toString());
        System.out.println("Readability: " + readability.toString());
        System.out.println("Avg Skill : " + (float)avgs / skill.size());
        System.out.println("Avg Readability : " + (float)avgr / readability.size() + "\n");

    }

    private Integer calculateScore(ProjectMetrics solution, char not) {
        Integer group = 0; //Skill or Readability
        for (Map.Entry<String, Integer> vio : solution.getPMDViolations().entrySet()) {
            PMDRule rule = pmdrules.get(vio.getKey());
            if (rule.getGroup() != not) {
                int priority = rule.getPriority();
                int occurrences = vio.getValue();
                //skill += priority * occurrences;
                //skill += occurrences;
                group++;
            }
        }
        return group;
    }

    private void calcForMetric(Class<?> c, Metric m) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = c.getDeclaredMethod(m.getMethodName());
        Object bS = method.invoke(baseSolution);
        float base = toFloat(bS);
        String signal = m.getThis();
        float highest = 1;
        for (ProjectMetrics pm : exampleSolutions) {
            Object oS = method.invoke(pm);
            float example = toFloat(oS);
            if (signal.equals("-")) {
                example = base + (base - example);
            }
            if (example > highest) {
                highest = example;
            }
        }
        for (ProjectMetrics pm : exampleSolutions) {
            Object oS = method.invoke(pm);
            float example, value = example = toFloat(oS);
            if (signal.equals("-")) {
                example = base + (base - example);
            }
            float ratio = example / highest;
            calcForProject(pm.getProjectName(), m.getImplies(), m.getPriority(), ratio, value);
        }
    }

    private float toFloat(Object bS) {
        float bs;
        if (bS.getClass() == Integer.class) {
            bs = new Float((Integer)bS);
        } else {
            bs = (Float)bS;
        }
        return bs;
    }

    private void calcForProject(String pName, String implies, int priority, float ratio, float value) {
        float s = skill.get(pName);
        float r = readability.get(pName);
        float priXrat = priority * ratio;
        char sig = '+';
        String group = null;
        switch (implies) {
            case "+S":
                skill.put(pName, s + priXrat);
                sig = '+';
                group = "skill";
                break;
            case "+R":
                readability.put(pName, r + priXrat);
                sig = '+';
                group = "readability";
                break;
            case "-S":
                skill.put(pName, s - priXrat);
                sig = '-';
                group = "skill";
                break;
            case "-R":
                readability.put(pName, r - priXrat);
                sig = '-';
                group = "readability";
                break;
        }
        System.out.println(pName + " (" + round(value) + ") : " + round(ratio) + " * " + priority + " = " + sig + round(priXrat) + " in " + group);
    }

    private float round (float value) { //Round float to 1 decimal place
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(1, RoundingMode.HALF_UP); //decimal places = 1
        return (float) bd.doubleValue();
    }

    public Map<String, Float> getReadability() {
        return readability;
    }

    public Map<String, Float> getSkill() {
        return skill;
    }

}
