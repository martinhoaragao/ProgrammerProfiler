import java.util.HashMap;

public class Feedback {
    private HashMap<String, Project> projects;
    private StringBuilder log;

    public Feedback(HashMap<String, Project> projects) {
        this.projects = projects;

        this.log = new StringBuilder();
    }

    public StringBuilder getLog() {
        return log;
    }

    public void provideFeedback() {
        for (Project project : projects.values()) {



            System.out.println();
            System.out.println();

            System.out.println("Skill: " + project.getSkill() + " Readability: " + project.getReadability());

            if (project.getSkillViolationImpact() > project.getReadabilityViolationImpact()) {
                System.out.println("You should improve your skill: " + project.getSkillViolationImpact() + "% was the penalty you suffered from violations");
            } else {
                System.out.println("You should improve your readability: " + project.getReadabilityViolationImpact() + "% was the penalty you suffered from violations");
            }


        }
    }

}
