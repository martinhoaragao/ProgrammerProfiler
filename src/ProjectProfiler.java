import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProjectProfiler extends Thread {
    public static void main(String args[]) {
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
                directories = FolderManagement.getSubFolders("ExerciseExamples");
        }

        for (String directory : directories) {
            ProjectProfilerThread rPP = new ProjectProfilerThread(directory, base);
            rPP.start();
        }
    }
}

class ProjectProfilerThread implements Runnable {
    private Thread t;
    private String directory;
    private String base;

    ProjectProfilerThread(String directory, String base) {
        this.directory = directory;
        this.base = base;
    }

    @Override
    public void run() {
        System.out.println("Running " + directory);

        try {
            profileForExercise();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread " + directory + " exiting.");
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, directory);
            t.start();
        }
    }

    private void profileForExercise() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        HashMap<String, PMDRule> violationsDetected = new HashMap<>();
        ArrayList<ProjectMetrics> pm = new ArrayList<>();
        String problemDescpt = directory;
        String[] projects = FolderManagement.getSubFolders(directory);

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
                directory, FolderManagement.getFolderName(directory));

        LogGenerator lg = new LogGenerator(directory, sc.getLog(), pi.getLog());
        lg.generateLog();
        lg.writeLogToFile();

        ResultsExporter re = new ResultsExporter(sc.getReadability(), sc.getSkill());
        re.createJSONFile(FolderManagement.getFolderName(directory));
    }
}
