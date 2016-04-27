import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class REExtractor extends JavaBaseVisitor {
    private ParseTree tree;
    private Map<RE,Integer> res;

    public REExtractor(ParseTree tree) {
        this.tree = tree;
        res = new HashMap<>();
    }

    public void run () {
        this.visit(tree);
    }

    public Map<RE,Integer> getMetrics () {
        return this.res;
    }

    @Override
    public Object visitExpression(JavaParser.ExpressionContext ctx) {
        if (ctx.getText().equals("System.out")) {
            incr(RE.SYSOUT);
        }
        if (ctx.getText().equals("System.err")) {
            incr(RE.SYSERR);
        }
        return super.visitExpression(ctx);
    }

    private void incr(RE k) {
        if (!res.containsKey(k)) {
            res.put(k, 1);
        } else {
            res.put(k, res.get(k) + 1);
        }
    }
}
