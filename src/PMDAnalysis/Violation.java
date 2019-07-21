import java.util.ArrayList;

public class Violation {

    private float skillImpact, readabilityImpact;
    private ArrayList<Integer> linesViolated;
    private int occurences;
    private PMDRule pmdRule;

    public Violation(PMDRule pmdRule, ArrayList<Integer> linesViolated) {
        this.pmdRule = pmdRule;
        this.linesViolated = linesViolated;
        this.occurences = linesViolated.size();
    }

    public void setSkillImpact (float skillImpact) {
        this.skillImpact = skillImpact;
    }

    public void setReadabilityImpact (float readabilityImpact) {
        this.readabilityImpact = readabilityImpact;
    }

    public float getImpact(boolean isReadability) {
        if (isReadability) {
            return readabilityImpact;
        } else {
            return skillImpact;
        }

    }

    public ArrayList<Integer> getLinesViolated() {
        return linesViolated;
    }

    public PMDRule getPmdRule() {
        return pmdRule;
    }

    public float getReadabilityImpact() {
        return readabilityImpact;
    }

    public float getSkillImpact() {
        return skillImpact;
    }

    public int getOccurences() {
        return occurences;
    }
}
