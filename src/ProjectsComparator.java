import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProjectsComparator {

    private ProjectMetrics baseSolution;
    private ArrayList<ProjectMetrics> exampleSolutions;

    public ProjectsComparator(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
    }

    public void generateHTML() throws IOException {
        StringBuilder sb = new StringBuilder();
        genHeader(sb);
        genCounterT(sb);
        genLinesT(sb);
        genCFSsT(sb);
        genNSCOsT(sb);
        genVariablesT(sb);
        genFooter(sb);
        Files.write(Paths.get("C:\\Users\\Daniel\\Desktop\\test.html"), sb.toString().getBytes());
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
        sb.append("<caption>Counter Metrics</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Files");
        appendTH(sb, "Classes");
        appendTH(sb, "Methods");
        appendTH(sb, "Statements");
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
        sb.append("<caption>Lines Metrics</caption>");
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
        appendTD(sb, String.format("%.2f", baseSolution.getPerCode()));
        appendTD(sb, Integer.toString(baseSolution.getLinesOfComments()));
        appendTD(sb, String.format("%.2f", baseSolution.getPerComment()));
        appendTD(sb, Integer.toString(baseSolution.getEmptyLines()));
        appendTD(sb, String.format("%.2f", baseSolution.getPerEmpty()));
        appendTD(sb, Integer.toString(baseSolution.getTotalLines()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());

            appendTD(sb, Integer.toString(es.getLinesOfCode()));
            appendTD(sb, String.format("%.2f", es.getPerCode()));

            appendTD(sb, Integer.toString(es.getLinesOfComments()));
            compareFloatGreater(sb, es.getPerComment(), baseSolution.getPerComment());

            appendTD(sb, Integer.toString(es.getEmptyLines()));
            appendTD(sb, String.format("%.2f", es.getPerEmpty()));

            appendTD(sb, Integer.toString(es.getTotalLines()));
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genCFSsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Control Flow Statements Metrics</caption>");
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
        sb.append("<caption>Not So Common Operators Metrics</caption>");
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
            appendTD(sb, Integer.toString(es.getTotalNumberOfNSCO()));
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genVariablesT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Variable Declaration Metrics</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Variable Declarations");
        appendTH(sb, "Total Number Of Declarations");
        appendTH(sb, "Total Number Of Types");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getVariableDeclarations().toString());
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfDeclarations()));
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfTypes()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getVariableDeclarations().toString());
            compareIntegerLesser(sb, es.getTotalNumberOfDeclarations(), baseSolution.getTotalNumberOfDeclarations());
            compareIntegerGreater(sb, es.getTotalNumberOfTypes(), baseSolution.getTotalNumberOfTypes());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genFooter(StringBuilder sb) {
        sb.append("</table></body></html>");
    }

    private void compareFloatLesser(StringBuilder sb, float es, float base) {
        if (es < base) {
            appendTDGreen(sb, String.format("%.2f", es));
        } else if (es > base) {
            appendTDRed(sb, String.format("%.2f", es));
        } else {
            appendTD(sb, String.format("%.2f", es));
        }
    }

    private void compareFloatGreater(StringBuilder sb, float es, float base) {
        if (es > base) {
            appendTDGreen(sb, String.format("%.2f", es));
        } else if (es < base) {
            appendTDRed(sb, String.format("%.2f", es));
        } else {
            appendTD(sb, String.format("%.2f", es));
        }
    }

    private void compareIntegerLesser(StringBuilder sb, int es, int base) {
        if (es < base) {
            appendTDGreen(sb, Integer.toString(es));
        } else if (es > base) {
            appendTDRed(sb, Integer.toString(es));
        } else {
            appendTD(sb, Integer.toString(es));
        }
    }

    private void compareIntegerGreater(StringBuilder sb, int es, int base) {
        if (es > base) {
            appendTDGreen(sb, Integer.toString(es));
        } else if (es < base) {
            appendTDRed(sb, Integer.toString(es));
        } else {
            appendTD(sb, Integer.toString(es));
        }
    }

    void appendTD(StringBuilder sb, String contents) {
        appendTag(sb, "td", contents);
    }

    void appendTDRed(StringBuilder sb, String contents) {
        appendTag(sb, "td class='danger'", contents);
    }

    void appendTDGreen(StringBuilder sb, String contents) {
        appendTag(sb, "td class='success'", contents);
    }

    void appendTH(StringBuilder sb, String contents) {
        appendTag(sb, "th", contents);
    }

    void appendTag(StringBuilder sb, String tag, String contents) {
        sb.append('<').append(tag).append('>');
        sb.append(contents);
        sb.append("</").append(tag).append('>');
    }

}
