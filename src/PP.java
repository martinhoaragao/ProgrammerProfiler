import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;

public class PP  {
    public static void main(String args[]) throws IOException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        HashSet<String> violationsDetected = new HashSet<>();
        String main = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Prof";
        String[] projects = {
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Ana",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Daniel",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia\\Vitor"
        };
        String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\S1_Cadeia";
        String problemDescpt = "S1) Escreva um programa Java que determine quantas vezes uma sub-cadeia de caracteres (" +
                "fornecida pelo utilizador) aparece no interior de uma outra cadeia (também fornecida inicialmente pelo utilizador). \n" +
                "Considere que a cadeia ‘BABABABA’ contém tres subcadeias ‘BAB’ (‘BABABABA’).";

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
