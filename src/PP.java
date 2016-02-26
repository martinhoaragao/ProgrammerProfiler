import java.io.IOException;

public class PP  {
    public static void main (String args[]) throws IOException {

        PPAnalysis ppa = new PPAnalysis("C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Ze");

        ppa.preProcess();
        ppa.generateParseTrees();
        ppa.extractMetrics();
        ppa.generateCSVFile();
        System.out.print(ppa.getOverallStats());

    }

}
