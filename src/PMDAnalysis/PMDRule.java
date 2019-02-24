import java.io.Serializable;

public class PMDRule implements Serializable {

    private final String ruleset, description;
    private char group;
    private final int priority;

    public PMDRule(String[] line) {
        this.ruleset = line[6];
        this.description = line[5];
        this.priority = Integer.parseInt(line[3]);
        pickSkillGroup(this.ruleset);
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getRuleset() {
        return ruleset;
    }

    public char getGroup() {return group;}

    private void pickSkillGroup(String ruleset) {
        switch(ruleset) {
            case "Best Practices":
                this.group = 'R';
                break;
            case "Code Style":
                this.group = 'R';
                break;
            case "Design":
                this.group = 'R';
                break;
            case "Documentation":
                this.group = 'R';
                break;
            case "Error Prone":
                this.group = 'S';
                break;
            case "Multithreading":
                this.group = 'S';
                break;
            case "Performance":
                this.group = 'S';
                break;
            default:
                this.group = 'N';
                break;
        }
    }
}
