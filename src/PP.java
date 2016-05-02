import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;

public class PP  {
    public static void main(String args[]) throws IOException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        HashSet<String> violationsDetected = new HashSet<>();
        String main = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\A1_Arrays\\A1_Prof";
        String[] projects = {
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\A1_Arrays\\A1_Ana",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\A1_Arrays\\A1_Enes",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\A1_Arrays\\A1_Gabriel",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\A1_Arrays\\A1_Sergio",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\A1_Arrays\\A1_Ze"
        };
        String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\A1_Arrays";
        String problemDescpt = "A1) Escreva um programa Java que, dado um número inteiro N maior que 0, leia um vector " +
                "(array unidimensionnal) de N elementos inteiros e imprima quantos valores pares existem no vector.";

        PPAnalyser ppaBS = new PPAnalyser(main);
        ppaBS.preProcess();
        ppaBS.generateParseTrees();
        ppaBS.extractMetrics();

        PMDAnalyser pmdaBS = new PMDAnalyser(main);
        pmdaBS.analyse();
        pmdaBS.read();

        ProjectMetrics bS = ppaBS.getProjectMetrics();
        bS.setPMDViolations(pmdaBS.getViolations());

        violationsDetected.addAll(pmdaBS.getViolationsDetected());

        for (String p : projects) {
            PPAnalyser ppaES = new PPAnalyser(p);
            ppaES.preProcess();
            ppaES.generateParseTrees();
            ppaES.extractMetrics();

            PMDAnalyser pmdaES = new PMDAnalyser(p);
            pmdaES.analyse();
            pmdaES.read();

            ProjectMetrics eS = ppaES.getProjectMetrics();
            eS.setPMDViolations(pmdaES.getViolations());
            pm.add(eS);

            violationsDetected.addAll(pmdaES.getViolationsDetected());
        }

        ProjectsComparison pc = new ProjectsComparison(bS, pm, violationsDetected, problemDescpt);
        pc.loadRules();
        pc.generateHTML(directory);
        //pc.saveComparison("save-name");

    }

}
