// RegexTest.java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class RegexTest {
    private RegexTest() { }

    public static void main(String[] args){
        if (args.length != 2) {
            System.err.println("java RegexTest <regex> <input>");
            System.exit(1);
        }

        Pattern pattern = Pattern.compile(args[0]);
        Matcher matcher = pattern.matcher(args[1]);

        int n = 0;
        while (matcher.find()) {
            System.out.printf("token \"%s\" from index %d to index %d%n",
                              matcher.group(),
                              matcher.start(),
                              matcher.end());
            ++n;
        }

        System.out.printf("%d tokens found", n);
    }
}

