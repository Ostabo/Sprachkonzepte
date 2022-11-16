package u3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import u2.*;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class HtwgJavaAnalyzer extends HtwgJavaParserBaseListener {

    public static void main(String[] args) throws IOException {
        HtwgJavaLexer lexer = new HtwgJavaLexer(args.length >= 1 ?
                CharStreams.fromString(args[0]) : CharStreams.fromStream(System.in));
        HtwgJavaParser parser = new HtwgJavaParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.literal();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            //System.exit(1);
        }

        new ParseTreeWalker().walk(new HtwgJavaAnalyzer(), tree);
    }

    @Override
    public void enterIntegerLiteral(HtwgJavaParser.IntegerLiteralContext ctx) {
        System.out.println("Found an IntegerLiteral: " + ctx.getText());
        if (ctx.start.getType() == HtwgJavaParser.DECIMAL_LITERAL) {
            var literal = ctx.DECIMAL_LITERAL().getText();
            System.out.println(literal);
            if (literal.endsWith("L") || literal.endsWith("l")) {
                System.out.println("Expected Long: ");
                if (Long.parseLong(literal.substring(0, literal.length() - 1)) > Integer.MAX_VALUE) {
                    System.out.println("Found Long");
                } else {
                    System.err.println("Wrong range!");
                }

            } else {
                System.out.println("Expected Integer: ");
                if (Integer.parseInt(literal) <= Integer.MAX_VALUE) {
                    System.out.println("Found Integer");
                } else {
                    System.err.println("Wrong range!");
                }
            }

        }
    }

}
