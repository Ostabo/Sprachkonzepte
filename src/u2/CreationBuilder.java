package u2;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CreationBuilder extends CreationParserBaseListener {

    private final List<Stack<Expr>> stackList = new LinkedList<>();

    private int depth = -1;

    public Creation build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);

        return (Creation) this.stackList.get(this.depth).pop();
    }

    @Override
    public void enterExpr(CreationParser.ExprContext ctx) {
        this.stackList.add(new Stack<>());
        this.depth++;
    }

    @Override
    public void exitExpr(CreationParser.ExprContext ctx) {
        if (ctx.getChildCount() == 6) {
            var l = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                l.append(ctx.getChild(i).getText());
            }


            var c = new Constructor(
                    l.toString(),
                    new LinkedList<>(this.stackList.get(this.depth)),
                    ctx.getChild(5).getText()
            );
            this.stackList.get(this.depth).clear();

            if (this.depth > 0)
                this.depth--;
            this.stackList.get(this.depth).push(c);

            System.out.println("Exited an Expr - Stack: " + this.stackList);
        }
    }

    @Override
    public void enterParam(CreationParser.ParamContext ctx) {
        if (ctx.start.getType() == CreationParser.NUM) {

            this.stackList.get(this.depth).push(new Atom(ctx.NUM().getText()));

        } else if (ctx.start.getType() == CreationParser.NAME) {

            this.stackList.get(this.depth).push(new Atom(ctx.NAME().getText()));

        }
        System.out.println("Got to an Atom - Stack: " + this.stackList);
    }

}
