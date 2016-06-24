import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;

public class PP  {
    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        HashSet<String> violationsDetected = new HashSet<>();
        String main = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Prof";
        String[] projects = {
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Ana",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Daniel",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Marcos",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Vitor"
        };
        String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\P1_Numeros";
        String problemDescpt = "P1) Escreva um programa Java que leia uma quantidade não determinada de números inteiros positivos (O número que encerrará a leitura será o zero). Calcule e imprima a quantidade de números pares e ímpares assim como a média (numero real) dos valores pares.\n" +
                "Exemplo:\n" +
                "Dados:\n" +
                "1 \n" +
                "2 \n" +
                "12 \n" +
                "7 \n" +
                "15 \n" +
                "0   \n" +
                "Resultado:  \n" +
                "2\n" +
                "3\n" +
                "7.0";

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

        ScoreCalculator sc = new ScoreCalculator(pc.getBaseSolution(), pc.getExampleSolutions(), pc.getPMDrules());
        sc.loadMetrics();
        sc.calculateScore();

        ProfileInferrer pi = new ProfileInferrer(sc.getReadability(), sc.getSkill());
        pi.calcBoundaries();
        pi.inferProfile();

    }

}
