package u3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import u2.Creation;
import u2.CreationLexer;
import u2.CreationParser;
import u2.CreationParserBaseListener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreationDynamicAnalyzer extends CreationParserBaseListener {

    static String pre = """
            package u3;
                        
            public class CreationDynamic {
                public static void main(String[] args) {
                    System.out.println(
                    """;
    static String post = """
            );
                }
            }""";

    StringBuilder sb = new StringBuilder(pre);

    public static void main(String[] args) throws IOException {
        CreationLexer lexer = new CreationLexer(args.length >= 1 ?
                CharStreams.fromString(args[0]) : CharStreams.fromStream(System.in));
        CreationParser parser = new CreationParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            //System.exit(1);
        }

        new ParseTreeWalker().walk(new CreationDynamicAnalyzer(), tree);

    }

    @Override
    public void enterExpr(CreationParser.ExprContext ctx) {
        if (ctx.getChildCount() == 6) {
            if (!ctx.getChild(2).getText().equals(SillyClass.class.getSimpleName())) {
                System.out.println(ctx.getChild(2).getText() + " == " + SillyClass.class.getSimpleName());
                throw new RuntimeException("Wrong class name!");
            }
            for (int i = 0; i < ctx.getChildCount(); i++) {
                sb.append(ctx.getChild(i).getText());
            }
            sb.append(post);

            try {
                FileWriter myWriter = new FileWriter("CreationDynamic.java");
                myWriter.write(sb.toString());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    @Override
    public void enterParam(CreationParser.ParamContext ctx) {
        if (ctx.getChildCount() != 1) {
            throw new RuntimeException("Wrong number of arguments for " + SillyClass.class.getSimpleName());
        }
    }

}
