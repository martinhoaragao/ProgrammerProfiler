import com.opencsv.CSVReader;
import net.sourceforge.pmd.PMD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class PMDAnalyser {

    private String dirPath;
    private String output_file;
    private HashMap<String, Integer> violations;
    private HashSet<String> violationsDetected;

    public PMDAnalyser(String dirPath) {
        this.dirPath = dirPath;
    }

    public void analyse () {
        String output_format = "csv";
        String rulesets = "java-unusedcode,java-optimizations,java-basic,java-design,java-codesize,java-controversial," +
                "java-braces,java-comments,java-empty,java-unnecessary";
        output_file = dirPath + "\\out." + output_format;
        String[] arguments = { "-d", dirPath, "-f", output_format, "-R", rulesets, "-r", output_file };

        PMD.run(arguments);
    }

    public void read () throws IOException {
        violations = new HashMap<>();
        violationsDetected = new HashSet<>();
        CSVReader reader = new CSVReader(new FileReader(output_file));
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            incr(nextLine[7]);
            violationsDetected.add(nextLine[7]);
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

    public HashSet<String> getViolationsDetected() {
        return violationsDetected;
    }
}