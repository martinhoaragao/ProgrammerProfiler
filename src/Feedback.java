import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Feedback {
    private HashMap<String, Project> projects;
    private HashMap<String, ArrayList<String>> feedbackGenerated;
    private StringBuilder log;
    private String directory;

    public Feedback(HashMap<String, Project> projects, String directory) {
        this.projects = projects;
        this.directory = directory;

        this.feedbackGenerated = new HashMap<>();
        this.log = new StringBuilder();
    }

    public StringBuilder getLog() {
        return log;
    }

    public void output() {
        for (String projectName : feedbackGenerated.keySet()) {
            Path file = Paths.get(directory + projectName + "/feedback.md");
            try {
                Files.write(file, feedbackGenerated.get(projectName), StandardCharsets.UTF_8);
            } catch (Exception e) {
                System.out.println("An issue occured with the file generation on " +  e);
            }
        }
    }

    public void generateFeedback() {
        for (Project project : projects.values()) {
            feedbackGenerated.put(project.getProjectName(), new ArrayList<>());
            String profile = project.getProfile();

            addHeader(project);

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

    private void appendFeedback(Project project, ArrayList<String> feedback) {
        String projectName = project.getProjectName();

        ArrayList<String> currentFeedback = feedbackGenerated.get(projectName);
        currentFeedback.addAll(feedback);
        feedbackGenerated.put(projectName, currentFeedback);
    }

    private void addHeader(Project project) {
        ArrayList<String> header = new ArrayList<>();

        header.add("# PP Tool Feedback System");
        header.add("");
        header.add("Through *" + project.getProjectName() + "* you have achieved a profile of **" + project.getProfile() + "**! ");
        header.add("This has earned you **" + project.getSkill() + "** skill and **" + project.getReadability() + "** readability score.");
        header.add("");

        header.add("> The system will now provide personalised feedback to help you improve your score. " +
                "This is done by prioritising the easiness and impact in your current score.");
        header.add("");

        appendFeedback(project, header);
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
        ArrayList<String> violationFeedback = new ArrayList<>();

        float boostPercentage;
        Violation projectViolation = project.getViolations().get(violationName);

        violationFeedback.add("We have identified you could improve your ");
        if(violationName == null) {
            // TODO THIS LATER MATE. WHAT IF NO VIOLATION?!
        } else if (isReadability) {
            boostPercentage = 100 * project.getReadability() / (project.getReadability() + projectViolation.getReadabilityImpact());
            violationFeedback.add("**readability**. And, by fixing just this tip its value would boost by " + boostPercentage + ".");
            violationFeedback.add("");
            violationFeedback.add("You just have to fix: " + violationName);

        } else {
            violationFeedback.add("skill which would boost your score by ");
        }

        appendFeedback(project, violationFeedback);
    }
}
