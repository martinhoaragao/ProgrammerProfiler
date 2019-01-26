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
    private float skillShift, readabilityShift = 0;
    private final ProjectMetrics baseSolution;
    private final ArrayList<ProjectMetrics> exampleSolutions;
    private StringBuilder log;

    public ScoreCalculator(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions, HashMap<String, PMDRule> pmdrules) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
        this.pmdrules = pmdrules;
    }

    void loadMetrics() throws FileNotFoundException { //Load PP Metrics
        final Type METRIC_TYPE = new TypeToken<List<Metric>>(){}.getType();
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("auxiliar/metrics.json"));
        metrics = new ArrayList<>(gson.fromJson(reader, METRIC_TYPE));
    }

    void calculateScore() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        skill = new HashMap<>();
        readability = new HashMap<>();
        log = new StringBuilder();

        for (ProjectMetrics pm : exampleSolutions) {
            skill.put(pm.getProjectName(), (float) 0);
            readability.put(pm.getProjectName(), (float) 0);
        }

        calculateScorePPAnalysis();

        decreaseScoreFromPMDViolations();

        shiftToFirstQuadrant();

        int avgs, avgr = avgs = 0;
        for (String key : skill.keySet()) {
            skill.put(key, round(skill.get(key)));
            avgs += skill.get(key);
        }
        for (String key : readability.keySet()) {
            readability.put(key, round(readability.get(key)));
            avgr += readability.get(key);
        }
        log.append("\nFinal Results:\nSkill  : " + skill.toString() + "\n");
        log.append("Readability: " + readability.toString() + "\n\n");
        log.append("Avg Skill : " + (float)avgs / skill.size() + "\n");
        log.append("Avg Readability : " + (float)avgr / readability.size() + "\n\n");
        System.out.println("\nFinal Results:\nSkill  : " + skill.toString());
        System.out.println("Readability: " + readability.toString());
        System.out.println("Avg Skill : " + (float)avgs / skill.size());
        System.out.println("Avg Readability : " + (float)avgr / readability.size() + "\n");

    }

    private void calculateScorePPAnalysis() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> c = Class.forName("ProjectMetrics");

        for (Metric m : metrics) {
            log.append("\n" + m.getMethodName() + ": " + m.getThis() + " -> " + m.getImplies() + "\nPriority: " + m.getPriority() + "\n");
            calcForMetric(c, m);
        }

        log.append("\nPre-PMD Results:\n\nSkill  : " + skill.toString() + "\n");
        log.append("\nReadability: " + readability.toString() + "\n");
        log.append("\nPMD Results (higher is worst): \n");

    }

    private void decreaseScoreFromPMDViolations() {
        for (ProjectMetrics pm : exampleSolutions) {
            String pName = pm.getProjectName();

            float sPenalty = calculateViolations(pm, 'R'); //Skill (Not R)
            float rPenalty = calculateViolations(pm, 'S'); //Readability (Not S)

            log.append(pm.getProjectName() + ": Skill=" + sPenalty + "   Readability: " + rPenalty + "\n");

            float finalSkillScore = skill.get(pName) - sPenalty;
            if (finalSkillScore < skillShift) {
                skillShift = finalSkillScore;
            }
            skill.put(pName, finalSkillScore);

            float finalReadabilityScore = readability.get(pName) - rPenalty;
            if (finalReadabilityScore < readabilityShift) {
                readabilityShift = finalReadabilityScore;
            }
            readability.put(pName, finalReadabilityScore);
        }
    }

    private float calculateViolations(ProjectMetrics solution, char not) {
        float violationsCount = 0;
        for (Map.Entry<String, Integer> vio : solution.getPMDViolations().entrySet()) {
            PMDRule rule = pmdrules.get(vio.getKey());
            if (rule.getGroup() != not) {
                int priority = rule.getPriority();
                int occurrences = vio.getValue();
                //skill += priority * occurrences;
                //skill += occurrences;
                //violationsCount = violationsCount + occurrences;
                violationsCount = violationsCount + (1 / priority);

            }
        }
        return violationsCount;
    }

    private void shiftToFirstQuadrant() {
        for (ProjectMetrics pm : exampleSolutions) {
            String pName = pm.getProjectName();
            skill.put(pName, skill.get(pName) - skillShift);
            readability.put(pName, readability.get(pName) - readabilityShift);
        }
    }

    private void calcForMetric(Class<?> c, Metric m) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = c.getDeclaredMethod(m.getMethodName());
        Object bS = method.invoke(baseSolution);
        float base = toFloat(bS);
        String signal = m.getThis();
        float bestResult = base;
        for (ProjectMetrics pm : exampleSolutions) {
            Object oS = method.invoke(pm);
            float example = toFloat(oS);
            if (signal.equals("-") && example < bestResult) {
                bestResult = example;
            } else if (signal.equals("+") && example > bestResult) {
                bestResult = example;
            }
        }
        for (ProjectMetrics pm : exampleSolutions) {
            Object oS = method.invoke(pm);
            System.out.println("Okay let me understand pls");
            float example, value = example = toFloat(oS);
            System.out.println(example + " .....  " + value + "  ... " + toFloat(oS));

            float ratio;
            if (signal.equals("-")) {
                ratio = bestResult / example;
            } else {
                ratio = example / bestResult;
            }

            if (ratio > 5 || ratio < -5) {
                System.out.println("ALERT ALERT");
                System.out.println(example + " okay " + bestResult + "    here it is, the base " + base + " what about the ");
            }
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
        log.append(pName + " (" + round(value) + ") : " + round(ratio) + " * " + priority + " = " + sig + round(priXrat) + " in " + group + "\n");
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

    public StringBuilder getLog() {
        return log;
    }

}
