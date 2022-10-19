// Foo.java
import java.util.Scanner;

public final class Foo {
    private Foo() { }

    public static void main(final String[] args) {
        String[] regex = {
            ".*foo",  // greedy quantifier
            ".*?foo", // reluctant quantifier
            ".*+foo"  // possessive quantifier
        };

        for (String a: args) {
            for (String r: regex) {
                System.out.printf("pattern %s in %s:%n", r, a);
                Scanner input = new Scanner(a);
                String s;
                while ((s = input.findInLine(r)) != null) {
                    System.out.println(s);
                }
            }
        }
    }
}

