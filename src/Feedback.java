import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Feedback {
    private HashMap<String, Project> projects;
    private HashMap<String, ArrayList<String>> feedbackGenerated;
    private StringBuilder log;
    private String directory;
    private List<Boundaries> bounds;

    public Feedback(HashMap<String, Project> projects, String directory, List<Boundaries> bounds) {
        this.projects = projects;
        this.directory = directory;
        this.bounds = bounds;

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
                System.out.println("An issue occurred with the file generation on " +  e);
            }
        }
    }

    public void generateFeedback() {
        for (Project project : projects.values()) {
            feedbackGenerated.put(project.getProjectName(), new ArrayList<>());
            String profile = project.getProfile();
            addHeader(project, projects.size());
            boolean isReadability = true;
            float improvement = 0;

            // Skill Leaning Profiles
            if (profile.equals("Advanced Beginner S") || profile.equals("Expert")) {
                isReadability = true;
                improvement = provideViolationTip(project, isReadability);

            // Readability Leaning Profiles
            } else if (profile.equals("Advanced Beginner R") || profile.equals("Proficient")) {
                isReadability = false;
                improvement = provideViolationTip(project, isReadability);

                // Balanced Profiles
            } else if (profile.equals("Novice") || profile.equals("Advanced Beginner +") || profile.equals("Master")) {
                isReadability = project.getReadabilityViolationImpact() >= project.getSkillViolationImpact();
                improvement = provideViolationTip(project, isReadability);
            }

            generateProgressMotivation(project, improvement, isReadability);


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

    private float provideViolationTip(Project project, boolean isReadability) {
        float improvement = 0;
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
            improvement = generateViolationFeedback(project, mostViolatedRule, isReadability);
        }

        return improvement;
    }

    private float generateViolationFeedback(Project project, String violationName, boolean isReadability) {
        ArrayList<String> violationFeedback = new ArrayList<>();
        float improvement;

        Violation projectViolation = project.getViolations().get(violationName);
        PMDRule rule = projectViolation.getPmdRule();

        violationFeedback.add("We have identified you could improve your ");
        if (isReadability) {
            violationFeedback.add("**readability**. ");
            improvement = projectViolation.getReadabilityImpact();
        } else {
            violationFeedback.add("**skill**. ");
            improvement = projectViolation.getSkillImpact();
        }

        violationFeedback = violationFeedbackCorrection(violationFeedback, violationName, projectViolation, rule);

        appendFeedback(project, violationFeedback);
        return improvement;
    }

    private ArrayList<String> violationFeedbackCorrection(ArrayList<String> violationFeedback, String violationName, Violation projectViolation, PMDRule rule) {
        violationFeedback.add("You violated rule [" +
                violationName + "](https://pmd.github.io/pmd-6.16.0/pmd_rules_java_codestyle.html#" + violationName +
                ") **" + projectViolation.getOccurences() + "** times.");

        violationFeedback.add("This rule is part of the set " + rule.getRuleset());
        violationFeedback.add("");
        violationFeedback.add("**Description**: " + rule.getDescription());
        violationFeedback.add("You have violated it in the following lines of the project: ");
        violationFeedback.add("");

        for (Integer line : projectViolation.getLinesViolated()) {
            violationFeedback.add("+ " + line);
        }
        violationFeedback.add("");

        return violationFeedback;
    }

    private void generateProgressMotivation(Project project, float improvement, boolean isReadability) {
        ArrayList<String> progressMotivation = new ArrayList<>();
        float boostPercentage = 0;
        String profile = project.getProfile(), newProfile = null;
        float readability = project.getReadability();
        float skill = project.getSkill();

        if (isReadability) {
            readability += improvement;
            boostPercentage = 100 - 100 * project.getReadability() / (project.getReadability() + improvement);
        } else {
            skill += improvement;
            boostPercentage = 100 - 100 * project.getSkill() / (project.getSkill() + improvement);
        }

        for (Boundaries b : bounds) {
            if (readability >= b.getMinR() && skill >= b.getMinS() &&
                readability <= b.getMaxS() && skill <= b.getMaxS()) {
                newProfile = b.getProfileName();
            }
        }


        progressMotivation.add("## Improvement Progress");
        progressMotivation.add("");
        progressMotivation.add("By following the recommendation above your score will improve by " + boostPercentage + "%.");
        if(newProfile != null && !profile.equals(newProfile)) {
            progressMotivation.add("And so you'll reach an even better profile: **" + newProfile + "**.");
        }

        progressMotivation.add("");



        switch (profile) {
            case "Novice":
                break;
            case "Advanced Beginner S":
                break;
            case "Advanced Beginner R":
                break;
            case "Advanced Beginner +":
                break;
            case "Expert":
                break;
            case "Proficient":
                break;
            case "Master":
                progressMotivation.add("Congratulations! You have already reached maximum profile!");
                progressMotivation.add("");
                progressMotivation.add("Even so, your score would improve by **" + boostPercentage + "%**.");
                progressMotivation.add("");
                break;
        }

        appendFeedback(project, progressMotivation);
    }
}
