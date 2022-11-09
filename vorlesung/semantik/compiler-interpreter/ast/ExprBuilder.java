// ExprBuilder.java
package ast;
import grammar.ExprLexer;
import grammar.ExprParser;
import grammar.ExprParserBaseListener;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Stack;

public final class ExprBuilder extends ExprParserBaseListener {
    private final ParseTree tree;
    private final Stack<Expr> stack;
    private int numberOfSemanticErrors;

    public ExprBuilder(ParseTree tree) {
        this.tree = tree;
        this.stack = new Stack<Expr>();
        this.numberOfSemanticErrors = 0;
    }

    public Expr build() {
        new ParseTreeWalker().walk(this, this.tree);
        return this.stack.pop();
    }

    public int getNumberOfSemanticErrors() {
        return this.numberOfSemanticErrors;
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

        try {
            this.stack.push(new Value(s));
        } catch(IllegalArgumentException x) {
            semanticError(ctx.Number().getSymbol(), x.getMessage());
            this.stack.push(new Value("NaN"));
        }
    }

    private void semanticError(Token t, String error) {
        this.numberOfSemanticErrors++;
        System.err.printf("line %d column %d: %s%n",
                          t.getLine(), t.getCharPositionInLine(), error);
    }
}

