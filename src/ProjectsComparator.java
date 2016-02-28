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

        /*HEADER------------------------------------------------------------------------------------------------------*/

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

        /*COUNTER TABLE-----------------------------------------------------------------------------------------------*/

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
            appendTD(sb, Integer.toString(es.getNumberOfFiles()));
            appendTD(sb, Integer.toString(es.getNumberOfClasses()));
            appendTD(sb, Integer.toString(es.getNumberOfMethods()));
            appendTD(sb, Integer.toString(es.getNumberOfStatements()));
            sb.append("</tr>");
        }
        sb.append("</table>");

        /*LINES TABLE-------------------------------------------------------------------------------------------------*/

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
            appendTD(sb, String.format("%.2f", es.getPerComment()));
            appendTD(sb, Integer.toString(es.getEmptyLines()));
            appendTD(sb, String.format("%.2f", es.getPerEmpty()));
            appendTD(sb, Integer.toString(es.getTotalLines()));
            sb.append("</tr>");
        }
        sb.append("</table>");

        /*CFS TABLE---------------------------------------------------------------------------------------------------*/

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

        /*NSCO TABLE--------------------------------------------------------------------------------------------------*/

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

        /*VARIABLES TABLE---------------------------------------------------------------------------------------------*/

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
            appendTD(sb, Integer.toString(es.getTotalNumberOfDeclarations()));
            appendTD(sb, Integer.toString(es.getTotalNumberOfTypes()));
            sb.append("</tr>");
        }
        sb.append("</table>");

        /*FOOTER------------------------------------------------------------------------------------------------------*/

        sb.append("</table></body></html>");

        Files.write(Paths.get("C:\\Users\\Daniel\\Desktop\\test.html"), sb.toString().getBytes());
    }

    void appendTD(StringBuilder sb, String contents) {
        appendTag(sb, "td", contents);
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
