// ExprBuilder.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Stack;

public final class ExprBuilder extends ExprParserBaseListener {
    private Stack<Expr> stack = new Stack<Expr>();

    public Expr build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return this.stack.pop();
    }

    @Override
    public void exitExpr(ExprParser.ExprContext ctx) {
        if (ctx.getChildCount() == 3) {
            Expr right = this.stack.pop();
            Expr left = this.stack.pop();
            String op = ctx.getChild(1).getText();
            this.stack.push(new Operation(left, op, right));
        }
    }

    @Override
    public void exitMultExpr(ExprParser.MultExprContext ctx) {
        if (ctx.getChildCount() == 3) {
            Expr right = this.stack.pop();
            Expr left = this.stack.pop();
            String op = ctx.getChild(1).getText();
            this.stack.push(new Operation(left, op, right));
        }
    }

    @Override
    public void exitValue(ExprParser.ValueContext ctx) {
        String s = ctx.Number().getText();
        switch (ctx.getStart().getType()) {
        case ExprLexer.PLUS:
            s = ctx.PLUS().getText() + s;
            break;
        case ExprLexer.MINUS:
            s = ctx.MINUS().getText() + s;
            break;
        }

        this.stack.push(new Value(s));
    }
}

