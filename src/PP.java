import java.io.IOException;
import java.util.ArrayList;

public class PP  {
    public static void main(String args[]) throws IOException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        String main = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Arrays";
        String[] projects = {
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Enes",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Gabriel",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Sergio",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Ze"};

        PPAnalysis baseSolution = new PPAnalysis(main);
        baseSolution.preProcess();
        baseSolution.generateParseTrees();
        baseSolution.extractMetrics();
        ProjectMetrics bS = baseSolution.getProjectMetrics();

        for (String p : projects) {
            PPAnalysis exampleSolution = new PPAnalysis(p);
            exampleSolution.preProcess();
            exampleSolution.generateParseTrees();
            exampleSolution.extractMetrics();
            pm.add(exampleSolution.getProjectMetrics());
        }

        ProjectsComparator pc = new ProjectsComparator(bS, pm);
        pc.generateHTML();

        //System.out.println(baseSolution.getOverallStats());
    }

}
