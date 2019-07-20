public class Violation {

    private float skillImpact, readabilityImpact;
    private int occurences;
    private PMDRule pmdRule;

    public Violation(PMDRule pmdRule, int occurences) {
        this.pmdRule = pmdRule;
        this.occurences = occurences;
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
