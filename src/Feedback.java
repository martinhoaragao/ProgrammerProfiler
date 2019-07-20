import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
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
            String profile = project.getProfile();

            // Skill Leaning Profiles
            if (profile.equals("Advanced Beginner S") || profile.equals("Expert")) {
                provideViolationTip(project, true);

            // Readability Leaning Profiles
            } else if (profile.equals("Advanced Beginner R") || profile.equals("Proficient")) {
                provideViolationTip(project, false);

                // Balanced Profiles
            } else if (profile.equals("Novice") || profile.equals("Advanced Beginner +") || profile.equals("Master")) {
                provideViolationTip(project);
            }

        }

    }

    private void provideViolationTip(Project project) {
        if (project.getReadabilityViolationImpact() >= project.getSkillViolationImpact()) {
            provideViolationTip(project, true);
        } else {
            provideViolationTip(project, false);
        }
    }

    private void provideViolationTip(Project project, boolean isReadability) {
        String mostViolatedRule = null;
        float violationImpact, mostViolatedRuleImpact = 0;
        HashMap<String, Violation> projectViolations = project.getViolations();


        for (String violationName : projectViolations.keySet()) {
            violationImpact = projectViolations.get(violationName).getImpact(isReadability);
            if (violationImpact > mostViolatedRuleImpact) {
                mostViolatedRuleImpact = violationImpact;
                mostViolatedRule = violationName;
            }
        }

        generateViolationFeedbackFile(project, mostViolatedRule, isReadability);
    }

    private void generateViolationFeedbackFile(Project project, String violationName, boolean isReadability) {
        float boostPercentage;
        Violation projectViolation = project.getViolations().get(violationName);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileOutputStream(new File(project.getProjectName()),false));

            writer.println("You have achieved a profile of " + project.getProfile() +
                    " through " + project.getProjectName() +
                    ". This has earned you " + project.getSkill() + " skill and " +
                    project.getReadability() + " readability score.<br/>");

            writer.print("We have identified you could improve your ");
            if(violationName == null) {
                // TODO THIS LATER MATE. WHAT IF NO VIOLATION?!
            } else if (isReadability) {
                writer.print("readability. And, by fixing just this tip its value would boost by ");
                System.out.println(project.getReadability() +" yay");
                System.out.println(projectViolation.getReadabilityImpact());
                boostPercentage = 100 * project.getReadability() / (project.getReadability() + projectViolation.getReadabilityImpact());
                writer.println(boostPercentage + "%.<br/>");
                writer.println("You just have to fix: " + violationName);

            } else {
                writer.println("skill which would boost your score by ");
            }

        } catch (Exception e) {
            System.out.println("Mate, just errors here: " + e);
        } finally {
            writer.close();
        }
    }
}
