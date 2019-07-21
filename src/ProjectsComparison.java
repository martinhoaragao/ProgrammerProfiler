import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;

public class ProjectsComparison {

    private final ProjectMetrics baseSolution;
    private final ArrayList<ProjectMetrics> exampleSolutions;
    private final HashMap<String, PMDRule> violationsDetected;
    private final String problemDescpt;

    public ProjectsComparison(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions,
                              HashMap<String, PMDRule> violationsDetected, String problemDescpt) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
        this.violationsDetected = violationsDetected;
        this.exampleSolutions.add(baseSolution);
        this.problemDescpt = problemDescpt;
    }

    void generateHTML(String dir) throws IOException {
        StringBuilder sb = new StringBuilder();
        genHeader(sb);
        genCounterT(sb);
        genLinesT(sb);
        genCFSsT(sb);
        genNSCOsT(sb);
        genVariablesT(sb);
        genREsT(sb);
        genPMDVsT(sb);
        genPMDST(sb);
        genPMDRsT(sb);
        genFooter(sb);
        String[] nodes = dir.split("/");
        String folderName = nodes[nodes.length - 1];
        Files.write(Paths.get(dir + "/" + folderName + ".html"), sb.toString().getBytes());
    }

    private void genHeader(StringBuilder sb) {
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<meta charset='UTF-8'>");
        sb.append("<link rel='stylesheet' " +
                "href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css' " +
                "integrity='sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7' " +
                "crossorigin='anonymous'>");
        sb.append("<title>Programmer Profiler</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1 style='text-align:center'>PP Analysis Comparator</h1>");
        sb.append("<p>").append(problemDescpt).append("</p>");
    }

    private void genCounterT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Counter Metrics (Mixed)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Files (R)");
        appendTH(sb, "Classes (R)");
        appendTH(sb, "Methods (R)");
        appendTH(sb, "Statements (S)");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, Integer.toString(baseSolution.getNumberOfFiles()));
        appendTD(sb, Integer.toString(baseSolution.getNumberOfClasses()));
        appendTD(sb, Integer.toString(baseSolution.getNumberOfMethods()));
        appendTD(sb, Integer.toString(baseSolution.getNumberOfStatementsWithoutRES()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            compareIntegerGreater(sb, es.getNumberOfFiles(), baseSolution.getNumberOfFiles());
            compareIntegerGreater(sb, es.getNumberOfClasses(), baseSolution.getNumberOfClasses());
            compareIntegerGreater(sb, es.getNumberOfMethods(), baseSolution.getNumberOfMethods());
            compareIntegerLesser(sb, es.getNumberOfStatementsWithoutRES(), baseSolution.getNumberOfStatementsWithoutRES());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genLinesT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Lines Metrics (Readability)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Lines Of Code");
        appendTH(sb, "% Code");
        appendTH(sb, "Lines of Comment");
        appendTH(sb, "% Comment");
        appendTH(sb, "Empty Lines");
        appendTH(sb, "% Empty");
        appendTH(sb, "Total Lines");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, Integer.toString(baseSolution.getLinesOfCode()));
        appendTD(sb, String.format("%.1f", baseSolution.getPerCode()));
        appendTD(sb, Integer.toString(baseSolution.getLinesOfComments()));
        appendTD(sb, String.format("%.1f", baseSolution.getPerComment()));
        appendTD(sb, Integer.toString(baseSolution.getEmptyLines()));
        appendTD(sb, String.format("%.1f", baseSolution.getPerEmpty()));
        appendTD(sb, Integer.toString(baseSolution.getTotalLines()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());

            compareIntegerGreater(sb, es.getLinesOfCode(), baseSolution.getLinesOfCode());
            compareFloatLesser(sb, es.getPerCode(), baseSolution.getPerCode());

            compareIntegerGreater(sb, es.getLinesOfComments(), baseSolution.getLinesOfComments());
            compareFloatGreater(sb, es.getPerComment(), baseSolution.getPerComment());

            compareIntegerGreater(sb, es.getEmptyLines(), baseSolution.getEmptyLines());
            compareFloatGreater(sb, es.getPerEmpty(), baseSolution.getPerEmpty());

            compareIntegerGreater(sb, es.getTotalLines(), baseSolution.getTotalLines());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genCFSsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Control Flow Statements Metrics (Both)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "CFSs");
        appendTH(sb, "NSC CFSs");
        appendTH(sb, "Variety");
        appendTH(sb, "Total");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getCFS().toString());
        appendTD(sb, Integer.toString(baseSolution.getNumberOfNSCCFS()));
        appendTD(sb, Integer.toString(baseSolution.getCFSVariety()));
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfCFS()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getCFS().toString());
            appendTD(sb, Integer.toString(es.getNumberOfNSCCFS()));
            appendTD(sb, Integer.toString(es.getCFSVariety()));
            appendTD(sb, Integer.toString(es.getTotalNumberOfCFS()));
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genNSCOsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Not So Common Operators Metrics (Skill)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "NSCOs");
        appendTH(sb, "Different NSCOs");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getNSCO().toString());
        appendTD(sb, Integer.toString(baseSolution.getDifferentTypesOfNSCO()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getNSCO().toString());
            compareIntegerGreater(sb, es.getDifferentTypesOfNSCO(), baseSolution.getDifferentTypesOfNSCO());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genVariablesT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Variable Declaration Metrics (Skill)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Variable Declarations");
        appendTH(sb, "Total Number Of Declarations");
        appendTH(sb, "Total Number Of Types");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, escapeHtml4(baseSolution.getVariableDeclarations().toString()));
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfDeclarations()));
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfTypes()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, escapeHtml4(es.getVariableDeclarations().toString()));
            compareIntegerLesser(sb, es.getTotalNumberOfDeclarations(), baseSolution.getTotalNumberOfDeclarations());
            compareIntegerGreater(sb, es.getTotalNumberOfTypes(), baseSolution.getTotalNumberOfTypes());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genREsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Relevant Expressions Metrics</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "REs");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getRE().toString());
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getRE().toString());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genPMDVsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>PMD Violations</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        for (Map.Entry<String, PMDRule> entry : violationsDetected.entrySet()) {
            appendTH(sb, entry.getKey() + " (" + entry.getValue().getGroup() + ")");
        }
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        for (Map.Entry<String, PMDRule> entry : violationsDetected.entrySet()) {
            if (baseSolution.getPMDViolations().containsKey(entry.getKey())) {
                appendTD(sb, baseSolution.getPMDViolations().get(entry.getKey()).toString());
            }
            else {
                appendTD(sb, "0");
            }
        }
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            for (Map.Entry<String, PMDRule> entry : violationsDetected.entrySet()) {
                if (es.getPMDViolations().containsKey(entry.getKey())) {
                    appendTD(sb, es.getPMDViolations().get(entry.getKey()).toString());
                }
                else {
                    appendTD(sb, "0");
                }
            }
            sb.append("</tr>");
        }

        sb.append("</table>");
    }

    private void genPMDST(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>PMD Violations Score</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Skill");
        appendTH(sb, "Readability");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        Integer baseSkill = calculateScore(baseSolution, 'R'); //Skill (Not R)
        appendTD(sb, baseSkill.toString());
        Integer baseReadability = calculateScore(baseSolution, 'S'); //Readability (Not S)
        appendTD(sb, baseReadability.toString());
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            compareIntegerLesser(sb, calculateScore(es, 'R'), baseSkill); //Skill (Not R)
            compareIntegerLesser(sb, calculateScore(es, 'S'), baseReadability); //Readability (Not S)
            sb.append("</tr>");
        }

        sb.append("</table>");
    }

    private Integer calculateScore(ProjectMetrics solution, char not) {
        Integer group = 0; //Skill or Readability
        for (Map.Entry<String, ArrayList<Integer>> vio : solution.getPMDViolations().entrySet()) {
            PMDRule rule = violationsDetected.get(vio.getKey());
            if (rule.getGroup() != not) {
                group++;
            }
        }
        return group;
    }

    private void genPMDRsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>PMD Rules</caption>");
        sb.append("<tr>");
        appendTH(sb, "Rule");
        appendTH(sb, "Ruleset");
        appendTH(sb, "Description");
        appendTH(sb, "Priority");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        for (Map.Entry<String, PMDRule> entry : violationsDetected.entrySet()) {
            PMDRule pmdr = entry.getValue();
            sb.append("<tr>");
            appendTD(sb, entry.getKey() + " (" + pmdr.getGroup() + ")");
            appendTD(sb, pmdr.getRuleset());
            appendTD(sb, pmdr.getDescription());
            appendTD(sb, String.valueOf(pmdr.getPriority()));
            sb.append("</tr>");
        }

        sb.append("</table>");
    }

    private void genFooter(StringBuilder sb) {
        sb.append("</table></body></html>");
    }

    private void compareFloatLesser(StringBuilder sb, float es, float base) {
        if (es < base) {
            appendTDGreen(sb, String.format("%.1f", es) + " (" + String.format("%.1f", es - base) + ")");
        } else if (es > base) {
            appendTDRed(sb, String.format("%.1f", es) + " (" + String.format("%.1f", base - es) + ")");
        } else {
            appendTD(sb, String.format("%.1f", es));
        }
    }

    private void compareFloatGreater(StringBuilder sb, float es, float base) {
        if (es > base) {
            appendTDGreen(sb, String.format("%.1f", es) + " (+" + String.format("%.1f", es - base) + ")");
        } else if (es < base) {
            appendTDRed(sb, String.format("%.1f", es) + " (-" + String.format("%.1f", base - es) + ")");
        } else {
            appendTD(sb, String.format("%.1f", es));
        }
    }

    private void compareIntegerLesser(StringBuilder sb, int es, int base) {
        if (es < base) {
            appendTDGreen(sb, Integer.toString(es) + " (" + Integer.toString(es - base) + ")");
        } else if (es > base) {
            appendTDRed(sb, Integer.toString(es) + " (+" + Integer.toString(es - base) + ")");
        } else {
            appendTD(sb, Integer.toString(es));
        }
    }

    private void compareIntegerGreater(StringBuilder sb, int es, int base) {
        if (es > base) {
            appendTDGreen(sb, Integer.toString(es) + " (+" + Integer.toString(es - base) + ")");
        } else if (es < base) {
            appendTDRed(sb, Integer.toString(es) + " (-" + Integer.toString(base - es) + ")");
        } else {
            appendTD(sb, Integer.toString(es));
        }
    }

    private void appendTD(StringBuilder sb, String contents) {
        appendTag(sb, "td", contents);
    }

    private void appendTDRed(StringBuilder sb, String contents) {
        appendTag(sb, "td class='danger'", contents);
    }

    private void appendTDGreen(StringBuilder sb, String contents) {
        appendTag(sb, "td class='success'", contents);
    }

    private void appendTH(StringBuilder sb, String contents) {
        appendTag(sb, "th", contents);
    }

    private void appendTag(StringBuilder sb, String tag, String contents) {
        sb.append('<').append(tag).append('>');
        sb.append(contents);
        sb.append("</").append(tag).append('>');
    }

    public HashMap<String, PMDRule> getPMDrules() {
        return violationsDetected;
    }

    public ProjectMetrics getBaseSolution() {
        return baseSolution;
    }

    public ArrayList<ProjectMetrics> getExampleSolutions() {
        return exampleSolutions;
    }
}
