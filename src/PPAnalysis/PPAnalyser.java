import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.LinkedList;

public class PPAnalyser {

    private final String dirPath;
    private LinkedList<File> files;
    private LinkedList<ParseTree> pTrees;
    private ProjectMetrics pMetrics;

    public PPAnalyser(String dirPath) {
        this.dirPath = dirPath;
    }

    //Reads all .java files from path to a LinkedList
    public void preProcess () {
        String pName = dirPath.substring(dirPath.lastIndexOf("/") + 1);
        File dir = new File(dirPath);
        System.out.println(dir);
        String[] fileType = {"java"};
        files = new LinkedList<>(FileUtils.listFiles(dir, fileType, true));
        pMetrics = new ProjectMetrics(pName, files.size());
    }

    //Generates ParseTrees for all files and stores them in a LinkedList
    public void generateParseTrees () throws IOException {
        ANTLRInputStream input;
        JavaLexer lexer;
        CommonTokenStream tokens;
        JavaParser parser;
        pTrees = new LinkedList<>();
        for (File file : files) {
            input = new ANTLRInputStream(new FileInputStream(file.getAbsolutePath()));
            lexer = new JavaLexer(input);
            tokens = new CommonTokenStream(lexer);
            parser = new JavaParser(tokens);
            ParseTree tree = parser.compilationUnit();
            pTrees.add(tree);
        }
    }

    //Extracts desired metrics from each file
    public void extractMetrics () throws IOException {

        //Metrics Regarding Lines (Code, Comment and Empty)
        LinesExtractor linesExtractor = new LinesExtractor(files);
        linesExtractor.run();
        pMetrics.addLineMetrics(linesExtractor.getMetrics());

        for (ParseTree tree : pTrees) {

            //Metrics Regarding Control Flow Statements
            CFSExtractor cfsExtractor = new CFSExtractor(tree);
            cfsExtractor.run();
            pMetrics.addCFSMetrics(cfsExtractor.getMetrics());

            //Metrics Regarding Variables and Declarations
            VariableExtractor varExtractor = new VariableExtractor(tree);
            varExtractor.run();
            pMetrics.addVariableMetrics(varExtractor.getMetrics());

            //Metrics Regarding the Counting of Constructs (classes, methods, statements, etc)
            CounterExtractor counterExtractor = new CounterExtractor(tree);
            counterExtractor.run();
            pMetrics.addCounterMetrics(counterExtractor.getMetrics());

            //Metrics Regarding Use of Not Common Operators
            NSCOExtractor nscoExtractor = new NSCOExtractor(tree);
            nscoExtractor.run();
            pMetrics.addOperatorMetrics(nscoExtractor.getMetrics());

            //Metrics Regarding Use of Relevant Expressions
            REExtractor reExtractor = new REExtractor(tree);
            reExtractor.run();
            pMetrics.addRelevantMetrics(reExtractor.getMetrics());

            pMetrics.generateMetrics();

        }
    }

    public ProjectMetrics getProjectMetrics() {
        return pMetrics;
    }

    //Returns metrics compilation
    public String getOverallStats() {
        return
            "Total Number Of Files: " + pMetrics.getNumberOfFiles() + "\n\n" +
            "Number Of Classes: " + pMetrics.getNumberOfClasses() + "\n" +
            "Number Of Methods: " + pMetrics.getNumberOfMethods() + "\n" +
            "Number Of Statements: " + pMetrics.getNumberOfStatements() + "\n\n" +
            "Number Of Lines of Code: " + pMetrics.getLinesOfCode() + "\n" +
            "Number Of Lines of Comment: " + pMetrics.getLinesOfComments() + "\n" +
            "Number Of Empty Lines: " + pMetrics.getEmptyLines() + "\n" +
            "Total Number Of Lines: " + pMetrics.getTotalLines() + "\n\n" +
            "Control Flow Statements: " + pMetrics.getCFS().toString() + "\n\n" +
            "Not So Common Operators: " + pMetrics.getNSCO().toString() + "\n" +
            "Total Number Of NSCO: " + pMetrics.getTotalNumberOfNSCO() + "\n\n" +
            "Variable Declaration: " + pMetrics.getVariableDeclarations().toString() + "\n" +
            "Total Number Of Declarations: " + pMetrics.getTotalNumberOfDeclarations() + "\n" +
            "Total Number Of Types: " + pMetrics.getTotalNumberOfTypes()
        ;
    }
}
