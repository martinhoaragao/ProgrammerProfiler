import com.opencsv.CSVReader;
import net.sourceforge.pmd.PMD;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class PMDAnalyser {

    private final String dirPath;
    private String output_file;
    private String cache_file;
    private HashMap<String, Integer> violations;
    private HashMap<String, PMDRule> violationsDetected;

    public PMDAnalyser(String dirPath) {
        this.dirPath = dirPath;
    }

    public void analyse () {
        String output_format = "csv";
        String rulesets = "rulesets/java/quickstart.xml";
        output_file = dirPath + "/out." + output_format;
        cache_file = dirPath + "/cache";
        String[] arguments = { "-d", dirPath, "-f", output_format, "-cache", cache_file , "-t", "2", "-R", rulesets, "-r", output_file };

        PMD.run(arguments);
    }

    public void read () throws IOException {
        violations = new HashMap<>();
        violationsDetected = new HashMap<>();
        CSVReader reader = new CSVReader(new FileReader(output_file));
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            if (!nextLine[7].equals("DataflowAnomalyAnalysis")) {
                incr(nextLine[7]);
                violationsDetected.put(nextLine[7], new PMDRule(nextLine));
            }
        }
    }

    private void incr(String k) {
        if (!violations.containsKey(k)) {
            violations.put(k, 1);
        } else {
            violations.put(k, violations.get(k) + 1);
        }
    }

    public HashMap<String, Integer> getViolations() {
        return violations;
    }

    public HashMap<String, PMDRule> getViolationsDetected() {
        return violationsDetected;
    }
}