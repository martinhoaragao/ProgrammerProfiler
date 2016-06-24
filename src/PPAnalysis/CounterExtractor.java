import org.antlr.v4.runtime.tree.ParseTree;

public class CounterExtractor extends JavaBaseVisitor {

    private final ParseTree tree;
    private int numberOfClasses;
    private int numberOfMethods;
    private int numberOfStatements;

    public CounterExtractor(ParseTree tree) {
        super();
        this.tree = tree;
        numberOfClasses = 0;
        numberOfMethods = 0;
        numberOfStatements = 0;
    }

    public void run () {
        this.visit(tree);
    }

    public int[] getMetrics () {
        return new int[]{numberOfClasses, numberOfMethods, numberOfStatements};
    }

    @Override
    public Object visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        numberOfClasses++;
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        numberOfMethods++;
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Object visitStatement(JavaParser.StatementContext ctx) {
        numberOfStatements++;
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitStatementBlock(JavaParser.StatementBlockContext ctx) {//Don't count block as statement
        numberOfStatements--;
        return super.visitStatementBlock(ctx);
    }
}
