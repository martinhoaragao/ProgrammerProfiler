import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;

public class ProjectsComparator {

    private ProjectMetrics baseSolution;
    private ArrayList<ProjectMetrics> exampleSolutions;
    private HashSet<String> violationsDetected;
    private HashMap<String, PMDRule> pmdrules;

    public ProjectsComparator(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions,
                              HashSet<String> violationsDetected) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
        this.violationsDetected = violationsDetected;
    }

    public void generateHTML() throws IOException {
        StringBuilder sb = new StringBuilder();
        genHeader(sb);
        genCounterT(sb);
        genLinesT(sb);
        genCFSsT(sb);
        genNSCOsT(sb);
        genVariablesT(sb);
        genREsT(sb);
        genPMDVsT(sb);
        genPMDRsT(sb);
        genFooter(sb);
        Files.write(Paths.get("AuxFiles/output.html"), sb.toString().getBytes());
    }

    private void genHeader(StringBuilder sb) {
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<link rel='stylesheet' " +
                "href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css' " +
                "integrity='sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7' " +
                "crossorigin='anonymous'>");
        sb.append("<title>Programmer Profiler</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1 style='text-align:center'>PP Analysis Comparator</h1>");
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
        appendTD(sb, Integer.toString(baseSolution.getNumberOfStatements()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            compareIntegerGreater(sb, es.getNumberOfFiles(), baseSolution.getNumberOfFiles());
            compareIntegerGreater(sb, es.getNumberOfClasses(), baseSolution.getNumberOfClasses());
            compareIntegerGreater(sb, es.getNumberOfMethods(), baseSolution.getNumberOfMethods());
            compareIntegerLesser(sb, es.getNumberOfStatements(), baseSolution.getNumberOfStatements());
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
        sb.append("<caption>Control Flow Statements Metrics (Skill)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "CFSs");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getCFS().toString());
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getCFS().toString());
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
        appendTH(sb, "# of NSCOs");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getNSCO().toString());
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfNSCO()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getNSCO().toString());
            compareIntegerGreater(sb, es.getTotalNumberOfNSCO(), baseSolution.getTotalNumberOfNSCO());
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
        for (String v : violationsDetected) {
            appendTH(sb, v);
        }
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        for (String v : violationsDetected) {
            if (baseSolution.getPMDViolations().containsKey(v))
                appendTD(sb, baseSolution.getPMDViolations().get(v).toString());
            else
                appendTD(sb, "0");
        }
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            for (String v : violationsDetected) {
                if (es.getPMDViolations().containsKey(v))
                    appendTD(sb, es.getPMDViolations().get(v).toString());
                else
                    appendTD(sb, "0");
            }
            sb.append("</tr>");
        }

        sb.append("</table>");
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
        for (String v : violationsDetected) {
            PMDRule pmdr = pmdrules.get(v);
            sb.append("<tr>");
            appendTD(sb, pmdr.getRule());
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
            appendTDRed(sb, Integer.toString(es) + " (" + Integer.toString(base - es) + ")");
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

    public void loadRules() throws IOException {
        pmdrules = new HashMap<>();
        CSVReader reader = new CSVReader(new FileReader("AuxFiles/pmd_rules.csv"));
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            pmdrules.put(nextLine[1], new PMDRule(nextLine[0], nextLine[1], nextLine[2], Integer.parseInt(nextLine[3])));
        }
    }

}
