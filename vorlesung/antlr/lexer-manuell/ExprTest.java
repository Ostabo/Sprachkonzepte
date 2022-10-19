// ExprTest.java
public final class ExprTest {
    private ExprTest() { }

    public static void main(String[] args) {
        ExprLexer lexer = new ExprLexer(args[0]);
        ExprLexer.Token t;
        while ((t = lexer.nextToken()) != null) {
            System.out.println(t);
        }
    }
}

