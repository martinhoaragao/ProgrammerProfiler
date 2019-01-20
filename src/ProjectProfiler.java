import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProjectProfiler {
    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String base = null;
        String[] directories;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - All Folders in ExerciseExamples");
        System.out.println("2 - Specific Folder in ExerciseExamples");

        int choice = scanner.nextInt();

        switch (choice) {
            case 2:
                System.out.println("What's the Exercise?");
                directories = new String[1];
                directories[0] = scanner.nextLine();

                System.out.println("What's the base exercise?");
                base = directories[0] + "/" + scanner.nextLine();
            default:
                directories = getSubFolders("ExerciseExamples");
        }

        for (String directory : directories) {
            profileForExercise(base, directory);
        }



    }

    private static void profileForExercise(String base, String directory) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        HashMap<String, PMDRule> violationsDetected = new HashMap<>();
        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        String problemDescpt = directory;
        String[] projects = getSubFolders(directory);

        if (base == null) {
            base = projects[0];
        }

        projects = ArrayUtils.removeElement(projects, base);

        PPAnalyser ppaBS = new PPAnalyser(base);
        ppaBS.preProcess();
        ppaBS.generateParseTrees();
        ppaBS.extractMetrics();

        PMDAnalyser pmdaBS = new PMDAnalyser(base);
        pmdaBS.analyse();
        pmdaBS.read();

        ProjectMetrics bS = ppaBS.getProjectMetrics();
        bS.setPMDViolations(pmdaBS.getViolations());

        violationsDetected.putAll(pmdaBS.getViolationsDetected());

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

            violationsDetected.putAll(pmdaES.getViolationsDetected());
        }

        ProjectsComparison pc = new ProjectsComparison(bS, pm, violationsDetected, problemDescpt);
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
                directories[i] = dir + "/" + directories[i];
            }
        }
        return directories;
    }

    private static String getFolderName(String dir) {
        String[] nodes = dir.split("/");
        return nodes[nodes.length - 1];
    }

}
