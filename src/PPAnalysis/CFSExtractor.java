import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class CFSExtractor extends JavaBaseVisitor {

    private ParseTree tree;
    private Map<CFS,Integer> cfss;

    public CFSExtractor(ParseTree tree) {
        this.tree = tree;
        cfss = new HashMap<>();
    }

    public void run () {
        this.visit(tree);
    }

    public Map<CFS,Integer> getMetrics () {
        return this.cfss;
    }

    @Override
    public Object visitIfStatement(JavaParser.IfStatementContext ctx) {
        incr(CFS.IF);
        return super.visitIfStatement(ctx);
    }

    @Override
    public Object visitWhileStatement(JavaParser.WhileStatementContext ctx) {
        incr(CFS.WHILE);
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Object visitDoWhileStatement(JavaParser.DoWhileStatementContext ctx) {
        incr(CFS.DOWHILE);
        return super.visitDoWhileStatement(ctx);
    }

    @Override
    public Object visitForStatement(JavaParser.ForStatementContext ctx) {
        incr(CFS.FOR);
        return super.visitForStatement(ctx);
    }

    @Override
    public Object visitSwitchStatement(JavaParser.SwitchStatementContext ctx) {
        incr(CFS.SWITCH);
        return super.visitSwitchStatement(ctx);
    }

    @Override
    public Object visitReturnStatement(JavaParser.ReturnStatementContext ctx) {
        incr(CFS.RETURN);
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Object visitBreakStatement(JavaParser.BreakStatementContext ctx) {
        incr(CFS.BREAK);
        return super.visitBreakStatement(ctx);
    }

    @Override
    public Object visitContinueStatement(JavaParser.ContinueStatementContext ctx) {
        incr(CFS.CONTINUE);
        return super.visitContinueStatement(ctx);
    }

    @Override
    public Object visitIifStatement(JavaParser.IifStatementContext ctx) {
        incr(CFS.IIF);
        return super.visitIifStatement(ctx);
    }

    private void incr(CFS k) {
        if (!cfss.containsKey(k)) {
            cfss.put(k, 1);
        } else {
            cfss.put(k, cfss.get(k) + 1);
        }
    }

}
