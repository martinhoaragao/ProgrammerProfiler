import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;

public class PP  {
    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        HashSet<String> violationsDetected = new HashSet<>();
        String main = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros\\Prof";
        String[] projects = {
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros\\Ana",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros\\Daniel",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros\\Gabriel",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros\\Vitor",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros\\Ze"
        };
        String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros";
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
        pc.loadMetrics();
        pc.loadRules();
        pc.calculateScore();
        pc.generateHTML(directory);
        //pc.saveComparison("save-name");

    }

}
