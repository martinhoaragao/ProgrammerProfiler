import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class PMDAnalyser {

    private final String dirPath;
    private String output_file;
    private String cache_file;
    private HashMap<String, ArrayList<Integer>> violations;
    private HashMap<String, PMDRule> violationsDetected;

    public PMDAnalyser(String dirPath) {
        this.dirPath = dirPath;
    }

    public void analyse () {
        String output_format = "csv";
        String rulesets = "rulesets/java/quickstart.xml";
        output_file = dirPath + "/out." + output_format;
        cache_file = dirPath + "/cache";
        String[] arguments = {"lib/pmd-bin-6.10.0/bin/run.sh pmd", "-d", dirPath, "-f", output_format, "-cache", cache_file, "-t", "0", "-R", rulesets, "-r", output_file };

        ProcessBuilder builder = new ProcessBuilder();
        builder.command(arguments);

    }

    public void read () throws IOException {
        violations = new HashMap<>();
        violationsDetected = new HashMap<>();
        CSVReader reader = new CSVReader(new FileReader(output_file));
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            incr(nextLine);
            violationsDetected.put(nextLine[7], new PMDRule(nextLine));
        }
    }

    private void incr(String[] k) {
        ArrayList<Integer> linesViolated;
        Integer newLine = Integer.parseInt(k[4]);

        if (violations.containsKey(k[7])) {
            linesViolated = violations.get(k[7]);
        } else {
            linesViolated = new ArrayList<>();
        }

        linesViolated.add(newLine);
        violations.put(k[7], linesViolated);

    }

    public HashMap<String, ArrayList<Integer>> getViolations() {
        return violations;
    }

    public HashMap<String, PMDRule> getViolationsDetected() {
        return violationsDetected;
    }
}