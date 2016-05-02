import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class NSCOExtractor extends JavaBaseVisitor {
    private ParseTree tree;
    private Map<NSCO,Integer> nscos;

    public NSCOExtractor(ParseTree tree) {
        this.tree = tree;
        nscos = new HashMap<>();
    }

    public void run () {
        this.visit(tree);
    }

    public Map<NSCO,Integer> getMetrics () {
        return this.nscos;
    }

    @Override
    public Object visitShiftExpression(JavaParser.ShiftExpressionContext ctx) {
        incr(NSCO.SHIFT);
        return super.visitShiftExpression(ctx);
    }

    @Override
    public Object visitBitAndExpression(JavaParser.BitAndExpressionContext ctx) {
        incr(NSCO.BIT_AND);
        return super.visitBitAndExpression(ctx);
    }

    @Override
    public Object visitBitOrExpression(JavaParser.BitOrExpressionContext ctx) {
        incr(NSCO.BIT_OR);
        return super.visitBitOrExpression(ctx);
    }

    @Override
    public Object visitCaretExpression(JavaParser.CaretExpressionContext ctx) {
        incr(NSCO.CARET);
        return super.visitCaretExpression(ctx);
    }

    @Override
    public Object visitPlusOrMinusOneExpression(JavaParser.PlusOrMinusOneExpressionContext ctx) {
        incr(NSCO.ONE_ADD_SUB);
        return super.visitPlusOrMinusOneExpression(ctx);
    }

    @Override
    public Object visitPlusEqualExpression(JavaParser.PlusEqualExpressionContext ctx) {
        incr(NSCO.ADD_ASSIGN);
        return super.visitPlusEqualExpression(ctx);
    }

    @Override
    public Object visitMinusEqualExpression(JavaParser.MinusEqualExpressionContext ctx) {
        incr(NSCO.SUB_ASSIGN);
        return super.visitMinusEqualExpression(ctx);
    }

    @Override
    public Object visitTimesEqualExpression(JavaParser.TimesEqualExpressionContext ctx) {
        incr(NSCO.MULT_ASSIGN);
        return super.visitTimesEqualExpression(ctx);
    }

    @Override
    public Object visitDivideEqualExpression(JavaParser.DivideEqualExpressionContext ctx) {
        incr(NSCO.DIV_ASSIGN);
        return super.visitDivideEqualExpression(ctx);
    }

    @Override
    public Object visitAndAssignExpression(JavaParser.AndAssignExpressionContext ctx) {
        incr(NSCO.AND_ASSIGN);
        return super.visitAndAssignExpression(ctx);
    }

    @Override
    public Object visitOrAssignExpression(JavaParser.OrAssignExpressionContext ctx) {
        incr(NSCO.OR_ASSIGN);
        return super.visitOrAssignExpression(ctx);
    }

    @Override
    public Object visitXorAssignExpression(JavaParser.XorAssignExpressionContext ctx) {
        incr(NSCO.XOR_ASSIGN);
        return super.visitXorAssignExpression(ctx);
    }

    @Override
    public Object visitRshiftAssignExpression(JavaParser.RshiftAssignExpressionContext ctx) {
        incr(NSCO.RSHIFT_ASSIGN);
        return super.visitRshiftAssignExpression(ctx);
    }

    @Override
    public Object visitUrshiftAssignExpression(JavaParser.UrshiftAssignExpressionContext ctx) {
        incr(NSCO.URSHIFT_ASSIGN);
        return super.visitUrshiftAssignExpression(ctx);
    }

    @Override
    public Object visitLshiftAssignExpression(JavaParser.LshiftAssignExpressionContext ctx) {
        incr(NSCO.LSHIFT_ASSIGN);
        return super.visitLshiftAssignExpression(ctx);
    }

    @Override
    public Object visitModAssignExpression(JavaParser.ModAssignExpressionContext ctx) {
        incr(NSCO.MOD_ASSIGN);
        return super.visitModAssignExpression(ctx);
    }

    private void incr(NSCO k) {
        if (!nscos.containsKey(k)) {
            nscos.put(k, 1);
        } else {
            nscos.put(k, nscos.get(k) + 1);
        }
    }

}
