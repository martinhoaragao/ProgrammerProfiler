import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class CFSExtractor extends JavaBaseVisitor {

    private final ParseTree tree;
    private final Map<CFS,Integer> cfss;

    public CFSExtractor(ParseTree tree) {
        super();
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
    public Object visitRegularForControl(JavaParser.RegularForControlContext ctx) {
        incr(CFS.FOR);
        return super.visitRegularForControl(ctx);
    }

    @Override
    public Object visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        incr(CFS.EFOR);
        return super.visitEnhancedForControl(ctx);
    }

    @Override
    public Object visitSwitchStatement(JavaParser.SwitchStatementContext ctx) {
        incr(CFS.SWITCH);
        return super.visitSwitchStatement(ctx);
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
