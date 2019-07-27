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
            addHeader(project, projects.size());

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

    private void addHeader(Project project, int numberOfProjects) {
        ArrayList<String> header = new ArrayList<>();

        header.add("# PP Tool Feedback System");
        header.add("Welcome to the PP Tool Feedback System! You have been compared to " + numberOfProjects +
                " other projects which solved the exact same exercise. By analysing metrics and mistakes a profile has been extracted." +
                "This is done with 2 key distinctions in mind Skill and Readability");
        header.add("## Profile Analysis");
        header.add("Your project which is named *" + project.getProjectName() + "* has achieved a profile of **" + project.getProfile() + "**! ");
        header.add("The score obtained is **" + project.getSkill() + "** skill and **" + project.getReadability() + "** readability.");
        header.add("");
        header.add("## Personalised Feedback");
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

        if (mostViolatedRule != null) {
            generateViolationFeedback(project, mostViolatedRule, isReadability);
        }
    }

    private void generateViolationFeedback(Project project, String violationName, boolean isReadability) {
        ArrayList<String> violationFeedback = new ArrayList<>();

        float boostPercentage = 0;
        Violation projectViolation = project.getViolations().get(violationName);
        PMDRule rule = projectViolation.getPmdRule();

        violationFeedback.add("We have identified you could improve your ");
        if (isReadability) {
            violationFeedback.add("**readability**. ");
            boostPercentage = 100 - 100 * project.getReadability() / (project.getReadability() + projectViolation.getReadabilityImpact());

        } else {
            violationFeedback.add("**skill**. ");
            boostPercentage = 100 - 100 * project.getSkill() / (project.getSkill() + projectViolation.getSkillImpact());
        }

        violationFeedback = violationFeedbackCorrection(violationFeedback, violationName, projectViolation, rule, boostPercentage);


        appendFeedback(project, violationFeedback);
    }

    private ArrayList<String> violationFeedbackCorrection(ArrayList<String> violationFeedback, String violationName, Violation projectViolation, PMDRule rule, float boostPercentage) {
        violationFeedback.add("You violated rule [" +
                violationName + "](https://pmd.github.io/pmd-6.16.0/pmd_rules_java_codestyle.html#" + violationName +
                ") **" + projectViolation.getOccurences() + "** times.");
        violationFeedback.add("");
        violationFeedback.add("By fixing this your score will improve by " + boostPercentage + "%.");
        violationFeedback.add("");
        violationFeedback.add("---");
        violationFeedback.add("This rule is part of the set " + rule.getRuleset());
        violationFeedback.add("");
        violationFeedback.add("**Description**: " + rule.getDescription());
        violationFeedback.add("You have violated it in the following lines of the project: ");
        violationFeedback.add("");

        for (Integer line : projectViolation.getLinesViolated()) {
            violationFeedback.add("+ " + line);
        }

        return violationFeedback;
    }
}
