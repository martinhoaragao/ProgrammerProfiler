import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProjectMetrics implements Serializable{

    private final String projectName;

    private final int numberOfFiles;
    private int numberOfClasses;
    private int numberOfMethods;
    private int numberOfStatements;

    private int linesOfCode;
    private float perCode;
    private int linesOfComments;
    private float perComment;
    private int emptyLines;
    private float perEmpty;
    private int totalLines;

    private final Map<CFS,Integer> cfss;
    private int numberOfCFS;

    private final Map<NSCO,Integer> nscos;
    private int numberOfNSCO;

    private final Map<String,Integer> variables; //local variables
    private int numberOfDeclarations;
    private int numberOfTypes;

    private final Map<RE,Integer> res;

    private Map<String, ArrayList<Integer>> PMDViolations;

    public ProjectMetrics (String projectName, int numberOfFiles) {
        this.projectName = projectName;
        this.numberOfFiles = numberOfFiles;
        cfss = new HashMap<>();
        nscos = new HashMap<>();
        variables = new HashMap<>();
        res = new HashMap<>();
    }

    public void generateMetrics () {
        perCode = ((float)linesOfCode / totalLines) * 100;
        perComment = ((float)linesOfComments / totalLines) * 100;
        perEmpty = ((float)emptyLines / totalLines) * 100;
        numberOfNSCO = countOperators();
        numberOfCFS = countCFS();
        numberOfTypes = variables.size();
        numberOfDeclarations = countVariables();
    }

    private int countVariables() {
        int aux = 0;
        for (int i: variables.values()) {
            aux = aux + i;
        }
        return aux;
    }

    private int countOperators() {
        int aux = 0;
        for (int i: nscos.values()) {
            aux = aux + i;
        }
        return aux;
    }

    private int countCFS() {
        int aux = 0;
        for (int i: cfss.values()) {
            aux = aux + i;
        }
        return aux;
    }

    public String getProjectName() {
        return projectName;
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

    public int getNumberOfStatementsWithoutRES () {
        int sysout, syserr = sysout = 0;
        if (res.containsKey(RE.SYSOUT)) {
            sysout = res.get(RE.SYSOUT);
        }
        if (res.containsKey(RE.SYSERR)) {
            syserr = res.get(RE.SYSERR);
        }
        int aux = sysout + syserr;
        return numberOfStatements - aux;
    }

    public int getNumberOfRES () {
        int aux = 0;
        for (RE r: res.keySet()) {
            aux = aux + res.get(r);
        }
        return aux;
    }

    public Map<CFS,Integer> getCFS() {
        return cfss;
    }

    public int getNumberOfNSCCFS () {
        int aux = 0;
        if (cfss.containsKey(CFS.DOWHILE)) {
            aux += cfss.get(CFS.DOWHILE);
        }
        if (cfss.containsKey(CFS.EFOR)) {
            aux += cfss.get(CFS.EFOR);
        }
        if (cfss.containsKey(CFS.IIF)) {
            aux += cfss.get(CFS.IIF);
        }
        return aux;
    }

    public int getCFSVariety () {
        return cfss.size();
    }

    public Map<NSCO,Integer> getNSCO() {
        return nscos;
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

    public float getPerCode() {
        return perCode;
    }

    public int getLinesOfComments() {
        return linesOfComments;
    }

    public float getPerComment() {
        return perComment;
    }

    public int getEmptyLines() {
        return emptyLines;
    }

    public float getPerEmpty() {
        return perEmpty;
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalNumberOfNSCO() {
        return this.numberOfNSCO;
    }

    public int getDifferentTypesOfNSCO() {
        return nscos.size();
    }

    public int getTotalNumberOfCFS() {
        return this.numberOfCFS;
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

    public void addOperatorMetrics(Map<NSCO, Integer> newOP) {
        for (Object o : newOP.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            NSCO op = (NSCO) pair.getKey();
            if (nscos.containsKey(op)) {
                nscos.put(op, nscos.get(op) + newOP.get(op));
            } else {
                nscos.put(op, newOP.get(op));
            }
        }
    }

    public void addRelevantMetrics(Map<RE, Integer> newRE) {
        for (Object o : newRE.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            RE op = (RE) pair.getKey();
            if (res.containsKey(op)) {
                res.put(op, res.get(op) + newRE.get(op));
            } else {
                res.put(op, newRE.get(op));
            }
        }
    }

    public Map<RE,Integer> getRE() {
        return res;
    }

    public void setPMDViolations(Map<String, ArrayList<Integer>> PMDViolations) {
        this.PMDViolations = PMDViolations;
    }

    public Map<String, ArrayList<Integer>> getPMDViolations() {
        return PMDViolations;
    }
}
