package u3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import u2.CreationLexer;
import u2.CreationParser;
import u2.CreationParserBaseListener;

import java.io.IOException;

public class CreationStatic extends CreationParserBaseListener {

    public static void main(String[] args) throws IOException {
        CreationLexer lexer = new CreationLexer(args.length >= 1 ?
                CharStreams.fromString(args[0]) : CharStreams.fromStream(System.in));
        CreationParser parser = new CreationParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.param();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            //System.exit(1);
        }

        new ParseTreeWalker().walk(new CreationStatic(), tree);
    }

    @Override
    public void enterParam(CreationParser.ParamContext ctx) {

        if (ctx.start.getType() == CreationParser.NUM) {
            System.out.println("Found a Number: " + ctx.getText());

            var literal = ctx.NUM().getText();
            System.out.println(literal);

            if (literal.endsWith("L") || literal.endsWith("l")) {
                System.out.print("Expected Long: ");
                if (Long.parseLong(literal.substring(0, literal.length() - 1)) > Integer.MAX_VALUE) {
                    System.out.println("\u001B[42m Found Long \u001B[0m");
                } else {
                    System.err.println("Wrong range!");
                }

            } else {
                System.out.print("Expected Integer: ");

                try {
                    Integer.parseInt(literal);
                    System.out.println("\u001B[42m Found Integer \u001B[0m");
                } catch (NumberFormatException e) {
                    System.err.println("Wrong range!");
                }
            }

        }
    }

}
