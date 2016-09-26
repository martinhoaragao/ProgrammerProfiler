import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;

public class ProjectProfiler {
    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        HashSet<String> violationsDetected = new HashSet<>();
        String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\Ex1_P1_Numeros";
        //String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\Ex2_P2_Idades";
        //String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\Ex3_A1_Arrays";
        //String directory = "C:\\Users\\Daniel\\Documents\\Tese\\SourceFiles\\SimpleExercises\\Ex4_S1_Cadeia";
        String base = directory + "\\" + "Prof";
        String[] projects = getSubFolders(directory);
        projects = ArrayUtils.removeElement(projects, base);
        String problemDescpt = "Problem Descpt";

        PPAnalyser ppaBS = new PPAnalyser(base);
        ppaBS.preProcess();
        ppaBS.generateParseTrees();
        ppaBS.extractMetrics();

        PMDAnalyser pmdaBS = new PMDAnalyser(base);
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

        ResultsPlotter.main(pi.getProfileToProjects(),
                pi.getMinS(), pi.getMaxS(), pi.getMinR(), pi.getMaxR(),
                directory, getFolderName(directory));

        LogGenerator lg = new LogGenerator(directory, sc.getLog(), pi.getLog());
        lg.generateLog();
        lg.writeLogToFile();

        ResultsExporter re = new ResultsExporter(sc.getReadability(), sc.getSkill());
        re.createJSONFile(getFolderName(directory));

    }

    private static String[] getSubFolders (String dir) {
        File file = new File(dir);
        String[] directories = file.list((current, name) -> new File(current, name).isDirectory());
        if (directories != null) {
            for (int i = 0; i<directories.length; i++) {
                directories[i] = dir + "\\" + directories[i];
            }
        }
        return directories;
    }

    private static String getFolderName(String dir) {
        String[] nodes = dir.split("\\\\");
        return nodes[nodes.length - 1];
    }

}
