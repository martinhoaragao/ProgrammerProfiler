import java.io.IOException;

public class PP  {
    public static void main(String args[]) throws IOException {

        PPAnalysis baseSolution = new PPAnalysis("C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Arrays");
        baseSolution.preProcess();
        baseSolution.generateParseTrees();
        baseSolution.extractMetrics();
        ProjectMetrics bS = baseSolution.getProjectMetrics();

        PPAnalysis exampleSolution = new PPAnalysis("C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Ze");
        exampleSolution.preProcess();
        exampleSolution.generateParseTrees();
        exampleSolution.extractMetrics();
        ProjectMetrics eS = exampleSolution.getProjectMetrics();

        PPAnalysis exampleSolution2 = new PPAnalysis("C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Sergio");
        exampleSolution2.preProcess();
        exampleSolution2.generateParseTrees();
        exampleSolution2.extractMetrics();
        ProjectMetrics eS2 = exampleSolution2.getProjectMetrics();

        PPAnalysis exampleSolution3 = new PPAnalysis("C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Enes");
        exampleSolution3.preProcess();
        exampleSolution3.generateParseTrees();
        exampleSolution3.extractMetrics();
        ProjectMetrics eS3 = exampleSolution3.getProjectMetrics();

        PPAnalysis exampleSolution4 = new PPAnalysis("C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Gabriel");
        exampleSolution4.preProcess();
        exampleSolution4.generateParseTrees();
        exampleSolution4.extractMetrics();
        ProjectMetrics eS4 = exampleSolution4.getProjectMetrics();

        ProjectsComparator pc = new ProjectsComparator(bS, new ProjectMetrics[]{eS, eS2, eS3, eS4});
        pc.generateHTML();

        //System.out.println(baseSolution.getOverallStats());
    }

}
