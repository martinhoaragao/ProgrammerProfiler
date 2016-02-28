import java.util.ArrayList;

public class ProjectsComparator {

    private ProjectMetrics baseSolution;
    private ArrayList<ProjectMetrics> exampleSolutions;

    public ProjectsComparator(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
    }

    public void generateHTML() {
        StringBuilder sb = new StringBuilder();
        int i;
        sb.append("<html><head><link rel='stylesheet' " +
                "href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css' " +
                "integrity='sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7' " +
                "crossorigin='anonymous'>" +
                "<title>Programmer Profiler</title></head><body><h1>PP Analysis Comparator!</h1>");

        sb.append("<table class='table table-hover'><caption>Counter Metrics</caption>" +
                "<tr><th>Project</th><th>Files</th><th>Classes</th><th>Methods</th><th>Statements</th></tr>");
        sb.append("<tr><td>Base Solution</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getNumberOfFiles()) + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getNumberOfClasses()) + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getNumberOfMethods()) + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getNumberOfStatements()) + "</td></tr>");
        i = 1;
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr><td>Ex" + i + "</td>");
            sb.append("<td>" + Integer.toString(es.getNumberOfFiles()) + "</td>");
            sb.append("<td>" + Integer.toString(es.getNumberOfClasses()) + "</td>");
            sb.append("<td>" + Integer.toString(es.getNumberOfMethods()) + "</td>");
            sb.append("<td>" + Integer.toString(es.getNumberOfStatements()) + "</td></tr>");
            i++;
        }
        sb.append("</table>");

        sb.append("<table class='table table-hover'><caption>Lines Metrics</caption><tr><th>Project</th>" +
                "<th>Lines Of Code</th><th>Lines of Comment</th><th>Empty Lines</th><th>Total Lines</th></tr>");
        sb.append("<tr><td>Base Solution</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getLinesOfCode()) + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getLinesOfComments()) + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getEmptyLines()) + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getTotalLines()) + "</td></tr>");
        i = 1;
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr><td>Ex" + i + "</td>");
            sb.append("<td>" + Integer.toString(es.getLinesOfCode()) + "</td>");
            sb.append("<td>" + Integer.toString(es.getLinesOfComments()) + "</td>");
            sb.append("<td>" + Integer.toString(es.getEmptyLines()) + "</td>");
            sb.append("<td>" + Integer.toString(es.getTotalLines()) + "</td></tr>");
            i++;
        }
        sb.append("</table>");

        sb.append("<table class='table table-hover'><caption>Control Flow Statements Metrics</caption><tr><th>Project</th>" +
                "<th>CFSs</th></tr>");
        sb.append("<tr><td>Base Solution</td>");
        sb.append("<td>" + baseSolution.getCFS().toString() + "</td></tr>");
        i = 1;
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr><td>Ex" + i + "</td>");
            sb.append("<td>" + es.getCFS().toString() + "</td></tr>");
            i++;
        }
        sb.append("</table>");

        sb.append("<table class='table table-hover'><caption>Not So Common Operators Metrics</caption><tr><th>Project</th>" +
                "<th>NSCOs</th><th># of NSCOs</th></tr>");
        sb.append("<tr><td>Base Solution</td>");
        sb.append("<td>" + baseSolution.getNSCO().toString() + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getTotalNumberOfNSCO()) + "</td></tr>");
        i = 1;
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr><td>Ex" + i + "</td>");
            sb.append("<td>" + es.getNSCO().toString() + "</td>");
            sb.append("<td>" + Integer.toString(es.getTotalNumberOfNSCO()) + "</td></tr>");
            i++;
        }
        sb.append("</table>");

        sb.append("<table class='table table-hover'><caption>Variable Declaration Metrics</caption>" +
                "<tr><th>Project</th><th>Variable Declarations</th><th>Total Number Of Declarations</th>" +
                "<th>Total Number Of Types</th></tr>");
        sb.append("<tr><td>Base Solution</td>");
        sb.append("<td>" + baseSolution.getVariableDeclarations().toString() + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getTotalNumberOfDeclarations()) + "</td>");
        sb.append("<td>" + Integer.toString(baseSolution.getTotalNumberOfTypes()) + "</td></tr>");
        i = 1;
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr><td>Ex" + i + "</td>");
            sb.append("<td>" + es.getVariableDeclarations().toString() + "</td>");
            sb.append("<td>" + Integer.toString(es.getTotalNumberOfDeclarations()) + "</td>");
            sb.append("<td>" + Integer.toString(es.getTotalNumberOfTypes()) + "</td></tr>");
            i++;
        }
        sb.append("</table>");

        sb.append("</table></body></html>");

        System.out.println(sb.toString());
    }
}
