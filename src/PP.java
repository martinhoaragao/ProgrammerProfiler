import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class PP  {
    public static void main(String args[]) throws IOException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        HashSet<String> violationsDetected = new HashSet<>();
        String main = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Prof";
        String[] projects = {
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Enes",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Gabriel",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Sergio",
                "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\course_exercises\\Ex1_Ze"
        };

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

        ProjectsComparator pc = new ProjectsComparator(bS, pm, violationsDetected);
        pc.loadRules();
        pc.generateHTML();

    }

}
