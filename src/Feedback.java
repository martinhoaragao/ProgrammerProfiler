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
            Violation violationFixed = null;
            float readabilityImpact, skillImpact;

            // Skill Leaning Profiles
            if (profile.equals("Advanced Beginner S") || profile.equals("Expert")) {
                violationFixed = provideViolationTip(project, true);

            // Readability Leaning Profiles
            } else if (profile.equals("Advanced Beginner R") || profile.equals("Proficient")) {
                violationFixed = provideViolationTip(project, false);

                // Balanced Profiles
            } else if (profile.equals("Novice") || profile.equals("Advanced Beginner +") || profile.equals("Master")) {
                isReadability = project.getReadabilityViolationImpact() >= project.getSkillViolationImpact();
                violationFixed = provideViolationTip(project, isReadability);
            }

            if (violationFixed != null) {
                readabilityImpact = Math.round(100 * violationFixed.getReadabilityImpact()) / (float) 100;
                skillImpact = Math.round(100 * violationFixed.getSkillImpact()) / (float) 100;

                generateProgressMotivation(project, readabilityImpact, skillImpact, isReadability);
            } else {
                addHeader(project, projects.size());
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

    private Violation provideViolationTip(Project project, boolean isReadability) {
        Violation mostViolatedRule = null;
        float violationImpact, mostViolatedRuleImpact = 0;
        HashMap<String, Violation> projectViolations = project.getViolations();


        for (String violationName : projectViolations.keySet()) {
            violationImpact = projectViolations.get(violationName).getImpact(isReadability);
            if (violationImpact > mostViolatedRuleImpact) {
                mostViolatedRuleImpact = violationImpact;
                mostViolatedRule = projectViolations.get(violationName);
            }
        }

        if (mostViolatedRule != null) {
            generateViolationFeedback(project, mostViolatedRule);
        }

        return mostViolatedRule;
    }

    private void generateViolationFeedback(Project project, Violation violation) {
        ArrayList<String> violationFeedback = new ArrayList<>();
        violationFeedback = violationFeedbackCorrection(violationFeedback, violation);

        appendFeedback(project, violationFeedback);
    }

    private ArrayList<String> violationFeedbackCorrection(ArrayList<String> violationFeedback, Violation violation) {
        violationFeedback.add("You violated rule [" +
                violation.getName() + "](https://pmd.github.io/pmd-6.16.0/pmd_rules_java_codestyle.html#" + violation.getName() +
                ") **" + violation.getOccurences() + "** times.");

        violationFeedback.add("This rule is part of the set " + violation.getPmdRule().getRuleset());
        violationFeedback.add("");
        violationFeedback.add("**Description**: " + violation.getPmdRule().getDescription());
        violationFeedback.add("You have violated it in the following lines of the project: ");
        violationFeedback.add("");

        for (Integer line : violation.getLinesViolated()) {
            violationFeedback.add("+ " + line);
        }
        violationFeedback.add("");

        return violationFeedback;
    }

    private void generateProgressMotivation(Project project, float readabilityImpact, float skillImpact, boolean isReadability) {
        ArrayList<String> progressMotivation = new ArrayList<>();
        float newReadability, newSkill, boostReadability, boostSkill;
        String profile = project.getProfile(), newProfile = null;
        float readability = project.getReadability();
        float skill = project.getSkill();

        newReadability = readability + readabilityImpact;
        boostReadability = 100 - 100 * (readability / newReadability);

        newSkill = skill + skillImpact;
        boostSkill = 100 - 100 * (skill / newSkill);

        for (Boundaries b : bounds) {
            if (newReadability >= b.getMinR() && newSkill >= b.getMinS() &&
                newReadability <= b.getMaxS() && newSkill <= b.getMaxS()) {
                newProfile = b.getProfileName();
            }
        }


        progressMotivation.add("## Improvement Progress");
        progressMotivation.add("");
        progressMotivation.add("By following the recommendation above your score will fundamentally improve on ");

        if (isReadability) {
            progressMotivation.add("**readability**. ");
        } else {
            progressMotivation.add("**skill**. ");
        }
        progressMotivation.add("");

        progressMotivation.add("- **Change in Readability**: " + readability + " -> " + newReadability);
        progressMotivation.add("(**" + boostReadability +  "%**).");
        progressMotivation.add("");
        progressMotivation.add("- **Change in Skill**: " + skill + " -> " + newSkill);
        progressMotivation.add("(**" + boostSkill +  "%**).");

        if(newProfile != null && !profile.equals(newProfile)) {
            progressMotivation.add("And so you'll reach an even better profile: **" + newProfile + "**.");
        }

        progressMotivation.add("");

        switch (newProfile) {
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
                break;
        }

        appendFeedback(project, progressMotivation);
    }
}
