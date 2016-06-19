import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.opencsv.CSVReader;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;

import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;

public class ProjectsComparison implements Serializable {

    private ProjectMetrics baseSolution;
    private ArrayList<ProjectMetrics> exampleSolutions;
    private HashSet<String> violationsDetected;
    private String problemDescpt;
    private HashMap<String, PMDRule> pmdrules;
    private ArrayList<Metric> metrics;
    Map<String, Float> skill, readability;

    public ProjectsComparison(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions,
                              HashSet<String> violationsDetected, String problemDescpt) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
        this.violationsDetected = violationsDetected;
        this.exampleSolutions.add(baseSolution);
        this.problemDescpt = problemDescpt;
    }

    public ProjectsComparison(ProjectMetrics baseSolution, ArrayList<ProjectMetrics> exampleSolutions,
                              HashSet<String> violationsDetected) {
        this.baseSolution = baseSolution;
        this.exampleSolutions = exampleSolutions;
        this.violationsDetected = violationsDetected;
        problemDescpt = "";
    }

    void generateHTML(String dir) throws IOException {
        StringBuilder sb = new StringBuilder();
        genHeader(sb);
        genCounterT(sb);
        genLinesT(sb);
        genCFSsT(sb);
        genNSCOsT(sb);
        genVariablesT(sb);
        genREsT(sb);
        genPMDVsT(sb);
        genPMDST(sb);
        genPMDRsT(sb);
        genFooter(sb);
        String[] nodes = dir.split("\\\\");
        String folderName = nodes[nodes.length - 1];
        Files.write(Paths.get(dir + "/" + folderName + ".html"), sb.toString().getBytes());
    }

    private void genHeader(StringBuilder sb) {
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<meta charset='UTF-8'>");
        sb.append("<link rel='stylesheet' " +
                "href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css' " +
                "integrity='sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7' " +
                "crossorigin='anonymous'>");
        sb.append("<title>Programmer Profiler</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1 style='text-align:center'>PP Analysis Comparator</h1>");
        sb.append("<p>").append(problemDescpt).append("</p>");
    }

    private void genCounterT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Counter Metrics (Mixed)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Files (R)");
        appendTH(sb, "Classes (R)");
        appendTH(sb, "Methods (R)");
        appendTH(sb, "Statements (S)");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, Integer.toString(baseSolution.getNumberOfFiles()));
        appendTD(sb, Integer.toString(baseSolution.getNumberOfClasses()));
        appendTD(sb, Integer.toString(baseSolution.getNumberOfMethods()));
        appendTD(sb, Integer.toString(baseSolution.getNumberOfStatementsWithoutRES()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            compareIntegerGreater(sb, es.getNumberOfFiles(), baseSolution.getNumberOfFiles());
            compareIntegerGreater(sb, es.getNumberOfClasses(), baseSolution.getNumberOfClasses());
            compareIntegerGreater(sb, es.getNumberOfMethods(), baseSolution.getNumberOfMethods());
            compareIntegerLesser(sb, es.getNumberOfStatementsWithoutRES(), baseSolution.getNumberOfStatementsWithoutRES());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genLinesT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Lines Metrics (Readability)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Lines Of Code");
        appendTH(sb, "% Code");
        appendTH(sb, "Lines of Comment");
        appendTH(sb, "% Comment");
        appendTH(sb, "Empty Lines");
        appendTH(sb, "% Empty");
        appendTH(sb, "Total Lines");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, Integer.toString(baseSolution.getLinesOfCode()));
        appendTD(sb, String.format("%.1f", baseSolution.getPerCode()));
        appendTD(sb, Integer.toString(baseSolution.getLinesOfComments()));
        appendTD(sb, String.format("%.1f", baseSolution.getPerComment()));
        appendTD(sb, Integer.toString(baseSolution.getEmptyLines()));
        appendTD(sb, String.format("%.1f", baseSolution.getPerEmpty()));
        appendTD(sb, Integer.toString(baseSolution.getTotalLines()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());

            compareIntegerGreater(sb, es.getLinesOfCode(), baseSolution.getLinesOfCode());
            compareFloatLesser(sb, es.getPerCode(), baseSolution.getPerCode());

            compareIntegerGreater(sb, es.getLinesOfComments(), baseSolution.getLinesOfComments());
            compareFloatGreater(sb, es.getPerComment(), baseSolution.getPerComment());

            compareIntegerGreater(sb, es.getEmptyLines(), baseSolution.getEmptyLines());
            compareFloatGreater(sb, es.getPerEmpty(), baseSolution.getPerEmpty());

            compareIntegerGreater(sb, es.getTotalLines(), baseSolution.getTotalLines());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genCFSsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Control Flow Statements Metrics (Both)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "CFSs");
        appendTH(sb, "NSC CFSs");
        appendTH(sb, "Variety");
        appendTH(sb, "Total");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getCFS().toString());
        appendTD(sb, Integer.toString(baseSolution.getNumberOfNSCCFS()));
        appendTD(sb, Integer.toString(baseSolution.getCFSVariety()));
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfCFS()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getCFS().toString());
            appendTD(sb, Integer.toString(es.getNumberOfNSCCFS()));
            appendTD(sb, Integer.toString(es.getCFSVariety()));
            appendTD(sb, Integer.toString(es.getTotalNumberOfCFS()));
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genNSCOsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Not So Common Operators Metrics (Skill)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "NSCOs");
        appendTH(sb, "Different NSCOs");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getNSCO().toString());
        appendTD(sb, Integer.toString(baseSolution.getDifferentTypesOfNSCO()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getNSCO().toString());
            compareIntegerGreater(sb, es.getDifferentTypesOfNSCO(), baseSolution.getDifferentTypesOfNSCO());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genVariablesT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Variable Declaration Metrics (Skill)</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Variable Declarations");
        appendTH(sb, "Total Number Of Declarations");
        appendTH(sb, "Total Number Of Types");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, escapeHtml4(baseSolution.getVariableDeclarations().toString()));
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfDeclarations()));
        appendTD(sb, Integer.toString(baseSolution.getTotalNumberOfTypes()));
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, escapeHtml4(es.getVariableDeclarations().toString()));
            compareIntegerLesser(sb, es.getTotalNumberOfDeclarations(), baseSolution.getTotalNumberOfDeclarations());
            compareIntegerGreater(sb, es.getTotalNumberOfTypes(), baseSolution.getTotalNumberOfTypes());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genREsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>Relevant Expressions Metrics</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "REs");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        appendTD(sb, baseSolution.getRE().toString());
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            appendTD(sb, es.getRE().toString());
            sb.append("</tr>");
        }
        sb.append("</table>");
    }

    private void genPMDVsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>PMD Violations</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        for (String v : violationsDetected) {
            appendTH(sb, v + " (" + pmdrules.get(v).getGroup() + ")");
        }
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        for (String v : violationsDetected) {
            if (baseSolution.getPMDViolations().containsKey(v))
                appendTD(sb, baseSolution.getPMDViolations().get(v).toString());
            else
                appendTD(sb, "0");
        }
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            for (String v : violationsDetected) {
                if (es.getPMDViolations().containsKey(v))
                    appendTD(sb, es.getPMDViolations().get(v).toString());
                else
                    appendTD(sb, "0");
            }
            sb.append("</tr>");
        }

        sb.append("</table>");
    }

    private void genPMDST(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>PMD Violations Score</caption>");
        sb.append("<tr>");
        appendTH(sb, "Project");
        appendTH(sb, "Skill");
        appendTH(sb, "Readability");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        appendTD(sb, baseSolution.getProjectName());
        Integer baseSkill = calculateScore(baseSolution, 'R'); //Skill (Not R)
        appendTD(sb, baseSkill.toString());
        Integer baseReadability = calculateScore(baseSolution, 'S'); //Readability (Not S)
        appendTD(sb, baseReadability.toString());
        sb.append("</tr>");
        for (ProjectMetrics es : exampleSolutions) {
            sb.append("<tr>");
            appendTD(sb, es.getProjectName());
            compareIntegerLesser(sb, calculateScore(es, 'R'), baseSkill); //Skill (Not R)
            compareIntegerLesser(sb, calculateScore(es, 'S'), baseReadability); //Readability (Not S)
            sb.append("</tr>");
        }

        sb.append("</table>");
    }

    private Integer calculateScore(ProjectMetrics solution, char not) {
        Integer group = 0; //Skill or Readability
        for (Map.Entry<String, Integer> vio : solution.getPMDViolations().entrySet()) {
            PMDRule rule = pmdrules.get(vio.getKey());
            if (rule.getGroup() != not) {
                int priority = rule.getPriority();
                int occurrences = vio.getValue();
                //skill += priority * occurrences;
                //skill += occurrences;
                group++;
            }
        }
        return group;
    }

    private void genPMDRsT(StringBuilder sb) {
        sb.append("<table class='table table-hover table-bordered'>");
        sb.append("<caption>PMD Rules</caption>");
        sb.append("<tr>");
        appendTH(sb, "Rule");
        appendTH(sb, "Ruleset");
        appendTH(sb, "Description");
        appendTH(sb, "Priority");
        sb.append("</tr>");

        sb.append("<tr class='active'>");
        for (String v : violationsDetected) {
            PMDRule pmdr = pmdrules.get(v);
            sb.append("<tr>");
            appendTD(sb, pmdr.getRule() + " (" + pmdr.getGroup() + ")");
            appendTD(sb, pmdr.getRuleset());
            appendTD(sb, pmdr.getDescription());
            appendTD(sb, String.valueOf(pmdr.getPriority()));
            sb.append("</tr>");
        }

        sb.append("</table>");
    }

    private void genFooter(StringBuilder sb) {
        sb.append("</table></body></html>");
    }

    private void compareFloatLesser(StringBuilder sb, float es, float base) {
        if (es < base) {
            appendTDGreen(sb, String.format("%.1f", es) + " (" + String.format("%.1f", es - base) + ")");
        } else if (es > base) {
            appendTDRed(sb, String.format("%.1f", es) + " (" + String.format("%.1f", base - es) + ")");
        } else {
            appendTD(sb, String.format("%.1f", es));
        }
    }

    private void compareFloatGreater(StringBuilder sb, float es, float base) {
        if (es > base) {
            appendTDGreen(sb, String.format("%.1f", es) + " (+" + String.format("%.1f", es - base) + ")");
        } else if (es < base) {
            appendTDRed(sb, String.format("%.1f", es) + " (-" + String.format("%.1f", base - es) + ")");
        } else {
            appendTD(sb, String.format("%.1f", es));
        }
    }

    private void compareIntegerLesser(StringBuilder sb, int es, int base) {
        if (es < base) {
            appendTDGreen(sb, Integer.toString(es) + " (" + Integer.toString(es - base) + ")");
        } else if (es > base) {
            appendTDRed(sb, Integer.toString(es) + " (+" + Integer.toString(es - base) + ")");
        } else {
            appendTD(sb, Integer.toString(es));
        }
    }

    private void compareIntegerGreater(StringBuilder sb, int es, int base) {
        if (es > base) {
            appendTDGreen(sb, Integer.toString(es) + " (+" + Integer.toString(es - base) + ")");
        } else if (es < base) {
            appendTDRed(sb, Integer.toString(es) + " (-" + Integer.toString(base - es) + ")");
        } else {
            appendTD(sb, Integer.toString(es));
        }
    }

    private void appendTD(StringBuilder sb, String contents) {
        appendTag(sb, "td", contents);
    }

    private void appendTDRed(StringBuilder sb, String contents) {
        appendTag(sb, "td class='danger'", contents);
    }

    private void appendTDGreen(StringBuilder sb, String contents) {
        appendTag(sb, "td class='success'", contents);
    }

    private void appendTH(StringBuilder sb, String contents) {
        appendTag(sb, "th", contents);
    }

    private void appendTag(StringBuilder sb, String tag, String contents) {
        sb.append('<').append(tag).append('>');
        sb.append(contents);
        sb.append("</").append(tag).append('>');
    }

    void calculateScore() throws InvocationTargetException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException {
        skill = new HashMap<>();
        readability = new HashMap<>();
        Class<?> c = Class.forName("ProjectMetrics");
        for (ProjectMetrics pm : exampleSolutions) {
            skill.put(pm.getProjectName(), (float) 0);
            readability.put(pm.getProjectName(), (float) 0);
        }
        for (Metric m : metrics) {
            System.out.println("\n" + m.getMethodName() + ": " + m.getThis() + " -> " + m.getImplies() + "\nPriority: " + m.getPriority());
            calcForMetric(c, m);
        }
        System.out.println("\nPre-PMD Results:\nSkill  : " + skill.toString());
        System.out.println("Readability: " + readability.toString());
        System.out.println("\nPMD Results (higher is worst): ");
        for (ProjectMetrics pm : exampleSolutions) {
            String pName = pm.getProjectName();
            int s = calculateScore(pm, 'R'); //Skill (Not R)
            int r = calculateScore(pm, 'S'); //Readability (Not S)
            System.out.println(pm.getProjectName() + ": Skill=" + s + "   Readability: " + r);
            skill.put(pName, skill.get(pName) - s);
            readability.put(pName, readability.get(pName) - r);
        }int avgs, avgr = avgs = 0;
        for (String key : skill.keySet()) {
            skill.put(key, round(skill.get(key)));
            avgs += skill.get(key);
        }
        for (String key : readability.keySet()) {
            readability.put(key, round(readability.get(key)));
            avgr += readability.get(key);
        }
        Map<String, Float> difference = new HashMap<>();
        for (String key : skill.keySet()) {
            difference.put(key, skill.get(key) - readability.get(key));
        }
        System.out.println("\nFinal Results:\nSkill  : " + skill.toString());
        System.out.println("Readability: " + readability.toString());
        System.out.println("Difference : " + difference.toString());
        System.out.println("Avg Skill : " + (float)avgs / skill.size());
        System.out.println("Avg Readability : " + (float)avgr / readability.size());

        ProfileInferrer pi = new ProfileInferrer(readability, skill);
        pi.calcBoundaries();
        pi.inferProfile();

    }

    private void calcForMetric(Class<?> c, Metric m) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = c.getDeclaredMethod(m.getMethodName());
        Object bS = method.invoke(baseSolution);
        float base = toFloat(bS);
        String signal = m.getThis();
        float highest = 1;
        for (ProjectMetrics pm : exampleSolutions) {
            Object oS = method.invoke(pm);
            float example = toFloat(oS);
            if (signal.equals("-"))
                example = base + (base - example);
            if (example > highest) highest = example;
        }
        for (ProjectMetrics pm : exampleSolutions) {
            Object oS = method.invoke(pm);
            float example, value = example = toFloat(oS);
            if (signal.equals("-"))
                example = base + (base - example);
            float ratio = example / highest;
            calcForProject(pm.getProjectName(), m.getImplies(), m.getPriority(), ratio, value);
        }
    }

    private float toFloat(Object bS) {
        float bs;
        if (bS.getClass() == Integer.class) {
            bs = new Float((Integer)bS);
        } else {
            bs = (Float)bS;
        }
        return bs;
    }

    private void calcForProject(String pName, String implies, int priority, float ratio, float value) {
        float s = skill.get(pName);
        float r = readability.get(pName);
        float priXrat = priority * ratio;
        char sig = '+';
        String group = null;
        switch (implies) {
            case "+S":
                skill.put(pName, s + priXrat);
                sig = '+';
                group = "skill";
                break;
            case "+R":
                readability.put(pName, r + priXrat);
                sig = '+';
                group = "readability";
                break;
            case "-S":
                skill.put(pName, s - priXrat);
                sig = '-';
                group = "skill";
                break;
            case "-R":
                readability.put(pName, r - priXrat);
                sig = '-';
                group = "readability";
                break;
        }
        System.out.println(pName + " (" + round(value) + ") : " + round(ratio) + " * " + priority + " = " + sig + round(priXrat) + " in " + group);

    }

    private float round (float value) { //Round float to 1 decimal place
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(1, RoundingMode.HALF_UP); //decimal places = 1
        return (float) bd.doubleValue();
    }

    void loadMetrics() throws FileNotFoundException {
        final Type METRIC_TYPE = new TypeToken<List<Metric>>(){}.getType();
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("AuxFiles/metrics.json"));
        metrics = new ArrayList<>(gson.fromJson(reader, METRIC_TYPE));
    }

    void loadRules() throws IOException {
        pmdrules = new HashMap<>();
        CSVReader reader = new CSVReader(new FileReader("AuxFiles/pmd_rules.csv"));
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            pmdrules.put(nextLine[1], new PMDRule(nextLine[0], nextLine[1], nextLine[2], Integer.parseInt(nextLine[3]), nextLine[4].charAt(0)));
        }
    }

    void saveComparison(String savename) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("AuxFiles/" + savename + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in AuxFiles/" + savename + ".ser");
        }catch(IOException i) {
            i.printStackTrace();
        }
    }

}
