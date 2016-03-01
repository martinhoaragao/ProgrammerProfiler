import java.io.IOException;
import java.util.ArrayList;

public class PP  {
    public static void main(String args[]) throws IOException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        String main = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\ex_idades\\Professor";
        String[] projects = {
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\ex_idades\\DanielNovais",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\ex_idades\\ZePereira",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\ex_idades\\JoaoCruz",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\ex_idades\\EduardoPessoa"};

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
