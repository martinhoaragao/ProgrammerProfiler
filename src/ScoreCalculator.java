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
import java.util.*;

public class ScoreCalculator {

    private HashMap<String, Project> projects;
    private final HashMap<String, PMDRule> pmdrules;
    private ArrayList<Metric> metrics;
    private Map<String, Float> skill, readability;
    private float maxSkillPenalty = 0, maxReadabilityPenalty = 0;
    private final ProjectMetrics baseSolution;
    private final ArrayList<ProjectMetrics> exampleSolutions;
    private StringBuilder log;

    public ScoreCalculator(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions, HashMap<String, PMDRule> pmdrules, HashMap<String, Project> projects) {
        this.projects = projects;
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
        this.pmdrules = pmdrules;
        try {
            this.loadMetrics();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        log = new StringBuilder();
    }

    private void loadMetrics() throws FileNotFoundException { //Load PP Metrics
        final Type METRIC_TYPE = new TypeToken<List<Metric>>(){}.getType();
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("auxiliar/metrics.json"));
        metrics = new ArrayList<>(gson.fromJson(reader, METRIC_TYPE));
    }

    public void calculateScore() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        skill = new HashMap<>();
        readability = new HashMap<>();

        for (ProjectMetrics pm : exampleSolutions) {
            projects.put(pm.getProjectName(), new Project(pm.getProjectName()));

            skill.put(pm.getProjectName(), (float) 0);
            readability.put(pm.getProjectName(), (float) 0);
        }

        calculateScorePPAnalysis();

        decreaseScoreFromPMDViolations();

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
            log.append("\n" + m.getMethodName() + ": " + m.getThis() + " -> " + m.getImplies() + "\nWeight: " + m.getWeight() + "\n");
            calcForMetric(c, m);
        }

        log.append("\nPre-PMD Results:\n\nSkill  : " + skill.toString() + "\n");
        log.append("\nReadability: " + readability.toString() + "\n");
        log.append("\nPMD Results (higher is worst): \n");

    }

    //Lowest map value
    private float getMin(Map<String, Float> m) {
        ArrayList<Float> list = new ArrayList<>(m.values());
        return Collections.min(list);
    }

    //Highest map value
    private float getMax(Map<String, Float> m) {
        ArrayList<Float> list = new ArrayList<>(m.values());
        return Collections.max(list);
    }

    private void decreaseScoreFromPMDViolations() {
        for (ProjectMetrics pm : exampleSolutions) {
            float sPenalty = calculateViolations(pm, 'R'); //Skill (Not R)
            float rPenalty = calculateViolations(pm, 'S'); //Readability (Not S)

            if (sPenalty > maxSkillPenalty) {
                maxSkillPenalty = sPenalty;
            }
            if (rPenalty > maxReadabilityPenalty) {
                maxReadabilityPenalty = rPenalty;
            }
        }

        for (ProjectMetrics pm : exampleSolutions) {
            String pName = pm.getProjectName();

            float sPenaltyRatio = calculateViolations(pm, 'R') * (float) 0.5 / maxSkillPenalty;
            float rPenaltyRatio = calculateViolations(pm, 'S') * (float) 0.5 / maxReadabilityPenalty;

            Project project = projects.get(pName);
            project.setViolationImpact(sPenaltyRatio, rPenaltyRatio);
            projects.put(pName, project);

            log.append(pm.getProjectName() + ": Skill: " + sPenaltyRatio + "   Readability: " + rPenaltyRatio + "\n");

            float finalSkillScore = skill.get(pName) * (1 - sPenaltyRatio);
            skill.put(pName, finalSkillScore);
            float finalReadabilityScore = readability.get(pName) * (1 - rPenaltyRatio);
            readability.put(pName, finalReadabilityScore);
        }
    }

    private float calculateViolations(ProjectMetrics solution, char not) {
        float violationsCount = 0;
        for (Map.Entry<String, Integer> vio : solution.getPMDViolations().entrySet()) {
            PMDRule rule = pmdrules.get(vio.getKey());
            char ruleGroup = rule.getGroup();
            if (ruleGroup != not && ruleGroup != 'N') {
                int priority = rule.getPriority();
                int occurrences = vio.getValue();
                float impact = occurrences * (float) 1 / priority;
                violationsCount += impact;

                Project project = projects.get(solution.getProjectName());
                project.putViolation(vio.getKey(), rule, occurrences, impact);

            }
        }
        return violationsCount;
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
            float example, value = example = toFloat(oS);
            float ratio;

            if (signal.equals("-") && bestResult == 0) {
                if (example == 0) {
                    ratio = 1;
                } else {
                    ratio = (float) 0.5 / example;
                }
            } else if (signal.equals("-")) {
                ratio = bestResult / example;
            } else {
                ratio = example / bestResult;
            }

            calcForProject(pm.getProjectName(), m, ratio, value);
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

    private void calcForProject(String pName, Metric m, float ratio, float value) {
        String implies = m.getImplies();
        int weight = m.getWeight();
        float s = skill.get(pName);
        float r = readability.get(pName);
        float impact = weight * ratio;
        char sig = '+';
        String group = null;

        switch (implies) {
            case "+S":
                skill.put(pName, s + impact);
                sig = '+';
                group = "skill";
                break;
            case "+R":
                readability.put(pName, r + impact);
                sig = '+';
                group = "readability";
                break;
            case "-S":
                skill.put(pName, s - impact);
                sig = '-';
                group = "skill";
                break;
            case "-R":
                readability.put(pName, r - impact);
                sig = '-';
                group = "readability";
                break;
        }

        Project currentProject = projects.get(pName);
        MetricImpact thisMetric = new MetricImpact(m, value, ratio);
        thisMetric.register(s, skill.get(pName), r, readability.get(pName));
        currentProject.addMetricImpact(m.getMethodName(), thisMetric);
        projects.put(pName, currentProject);

        log.append(pName + " (" + round(value) + ") : " + round(ratio) + " * " + weight + " = " + sig + round(impact) + " in " + group + "\n");
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
