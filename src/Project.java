import java.util.ArrayList;
import java.util.HashMap;

public class Project {

    private float skill, readability;
    private String projectName, profile;
    private HashMap<String, MetricImpact> metricsImpact;
    private HashMap<String, Violation> violations;
    private float skillViolationImpact, readabilityViolationImpact;

    public Project(String projectName) {
        this.projectName = projectName;

        metricsImpact = new HashMap<>();
        violations = new HashMap<>();
    }

    public Project(String projectName, float skill, float readability) {
        this.projectName = projectName;
        this.skill = skill;
        this.readability = readability;
    }

    public String getProjectName() {
        return projectName;
    }

    public float getReadability() {
        return (Math.round(100 * readability) / (float) 100);
    }

    public HashMap<String, MetricImpact> getMetricsImpact() {
        return metricsImpact;
    }

    public float getSkill() {
        return (Math.round(100 * skill) / (float)  100);
    }

    public String getProfile() {
        return profile;
    }

    public HashMap<String, Violation> getViolations() {
        return violations;
    }

    public float getReadabilityViolationImpact() {
        return readabilityViolationImpact;
    }

    public float getSkillViolationImpact() {
        return skillViolationImpact;
    }

    public void setProfile(String profile, float skill, float readability) {
        this.profile = profile;
        this.skill = skill;
        this.readability = readability;
    }

    public void addMetricImpact (String metric, MetricImpact metricImpact) {
        if(metricsImpact.containsKey(metric)) {
            MetricImpact previous = metricsImpact.get(metric);
            metricImpact.setImpactReadability(previous.getImpactReadability() + metricImpact.getImpactReadability());
            metricImpact.setImpactSkill(previous.getImpactSkill() + metricImpact.getImpactSkill());
        }
        this.metricsImpact.put(metric, metricImpact);
    }

    public void setViolationImpact(float skillViolationImpact, float readabilityViolationImpact) {
        this.skillViolationImpact = skillViolationImpact;
        this.readabilityViolationImpact = readabilityViolationImpact;
    }

    public void putViolation(String rule, PMDRule pmdRule, ArrayList<Integer> linesViolated, float impact) {
        Violation violation;
        if (violations.containsKey(rule)) {
            violation = violations.get(rule);
        } else {
            violation = new Violation (pmdRule, linesViolated);
        }

        if(pmdRule.getGroup() == 'B') {
            violation.setSkillImpact(impact);
            violation.setReadabilityImpact(impact);
        } else if (pmdRule.getGroup() == 'S') {
            violation.setSkillImpact(impact);
        } else {
            violation.setReadabilityImpact(impact);
        }

        violations.put(rule, violation);

    }

}
