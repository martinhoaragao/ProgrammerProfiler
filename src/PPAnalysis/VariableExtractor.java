import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class VariableExtractor extends JavaBaseVisitor {

    private final ParseTree tree;
    private final Map<String,Integer> lVariables; //local variables
    private final Map<String,Integer> fVariables; //field variables

    public VariableExtractor(ParseTree tree) {
        super();
        this.tree = tree;
        lVariables = new HashMap<>();
        fVariables = new HashMap<>();
    }

    public void run () {
        this.visit(tree);
    }

    @Override
    public Object visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        int count = ctx.getChild(1).getChildCount();
        String type = ctx.getChild(0).getText();
        for (int i = 0; i < count; i++) {
            ParseTree c = ctx.getChild(1).getChild(i);
            insertVar(c, true, type);
        }
        return super.visitLocalVariableDeclaration(ctx);
    }

    @Override
    public Object visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        int count = ctx.getChild(1).getChildCount();
        String type = ctx.getChild(0).getText();
        for (int i = 0; i < count; i++) {
            ParseTree c = ctx.getChild(1).getChild(i);
            insertVar(c, false, type);
        }
        return super.visitFieldDeclaration(ctx);
    }

    private void insertVar(ParseTree c, Boolean isLocal, String type) {
        if (c instanceof JavaParser.VariableDeclaratorContext) {
            int occ = StringUtils.countMatches(c.getText(), "[]");
            while (occ > 0) {
                type = type + "[]";
                occ--;
            }
            if (isLocal) {
                if (!lVariables.containsKey(type)) {
                    lVariables.put(type, 1);
                }
                else {
                    lVariables.put(type, lVariables.get(type) + 1);
                }
            }
            else {
                if (!fVariables.containsKey(type)) {
                    fVariables.put(type, 1);
                }
                else {
                    fVariables.put(type, fVariables.get(type) + 1);
                }
            }
        }
    }

    public Map<String, Integer> getMetrics () { //Currently there's no distinction between local and field variables
        for (Object o : fVariables.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            String cons = (String) pair.getKey();
            if (lVariables.containsKey(cons)) {
                lVariables.put(cons, lVariables.get(cons) + fVariables.get(cons));
            } else {
                lVariables.put(cons, fVariables.get(cons));
            }
        }
        return lVariables;
    }
}
