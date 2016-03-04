
public class PMDRule {

    private String rule, ruleset, description;
    private int priority;

    public PMDRule(String ruleset, String rule, String description, int priority) {
        this.ruleset = ruleset;
        this.description = description;
        this.priority = priority;
        this.rule = rule;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getRule() {
        return rule;
    }

    public String getRuleset() {
        return ruleset;
    }
}
