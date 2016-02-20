import java.util.HashMap;
import java.util.Map;

public class ProjectMetrics {

    private Map<CFS,Integer> cfss;
    private Map<String,Integer> variables; //local variables

    private int numberOfFiles;
    private int numberOfDeclarations;
    private int numberOfTypes;
    private int linesOfCode;
    private int linesOfComments;
    private int emptyLines;
    private int totalLines;
    private int numberOfClasses;
    private int numberOfMethods;
    private int numberOfStatements;

    public ProjectMetrics (int numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
        cfss = new HashMap<>();
        variables = new HashMap<>();
    }

    public void generateMetrics () {
        numberOfDeclarations = countValues();
        numberOfTypes = variables.size();
    }

    private int countValues() {
        int aux = 0;
        for (int i: variables.values()) {
            aux = aux + i;
        }
        return aux;
    }

    public int getNumberOfFiles () {
        return numberOfFiles;
    }

    public int getNumberOfClasses () {
        return numberOfClasses;
    }

    public int getNumberOfMethods () {
        return numberOfMethods;
    }

    public int getNumberOfStatements () {
        return numberOfStatements;
    }

    public Map<CFS,Integer> getCFS() {
        return cfss;
    }

    public Map<String,Integer> getVariableDeclarations() {
        return variables;
    }

    public int getTotalNumberOfDeclarations() {
        return numberOfDeclarations;
    }

    public int getTotalNumberOfTypes() {
        return numberOfTypes;
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }

    public int getLinesOfComments() {
        return linesOfComments;
    }

    public int getEmptyLines() {
        return emptyLines;
    }

    public int getTotalLines() {
        return totalLines;
    }

    public void addCFSMetrics(Map<CFS, Integer> newCFS) {
        for (Object o : newCFS.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            CFS cfs = (CFS) pair.getKey();
            if (cfss.containsKey(cfs)) {
                cfss.put(cfs, cfss.get(cfs) + newCFS.get(cfs));
            } else {
                cfss.put(cfs, newCFS.get(cfs));
            }
        }
    }

    public void addVariableMetrics(Map<String, Integer> newVar) {
        for (Object o : newVar.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            String var = (String) pair.getKey();
            if (variables.containsKey(var)) {
                variables.put(var, variables.get(var) + newVar.get(var));
            } else {
                variables.put(var, newVar.get(var));
            }
        }
    }

    public void addLineMetrics(int[] lineMetrics) {
        linesOfCode = lineMetrics[0];
        linesOfComments = lineMetrics[1];
        emptyLines = lineMetrics[2];
        totalLines = lineMetrics[3];
    }

    public void addCounterMetrics(int[] counterMetrics) {
        numberOfClasses += counterMetrics[0];
        numberOfMethods += counterMetrics[1];
        numberOfStatements += counterMetrics[2];
    }
}
