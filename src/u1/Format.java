package u1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatter("xxx %d yyy%n"));
        System.out.println(formatter("xxx%1$d yyy"));
        System.out.println(formatter("%1$-02.3dyyy"));
        System.out.println(formatter("Wochentag: %tA Uhrzeit: %tT"));
    }

    private static String formatter(String input) {

        Pattern patternGeneral =
                Pattern.compile(
                        "(%([1-9]\\$)?[-+#0,(\s]?\\d*(\\.\\d)?[bBhHsScCdoxXeEfgGaA%n])"
                );

        Pattern patternDate =
                Pattern.compile(
                        "(%([1-9]\\$)?[-+#0,(\s]?\\d*[tT][HIklLMSpQZzsBbhAaCYyjmdeRTrDFc])"
                );

        Pattern patternLeftover =
                Pattern.compile(
                        "(%[-+#0,(\s]?\\d*\\D)"
                );

        Pattern usePattern = Pattern.compile(
                patternGeneral.pattern()
                        + "|" + patternDate.pattern()
                        + "|" + patternLeftover.pattern()
        );

        var builder = new StringBuilder();

        Map<String, String> parts = new TreeMap<>(Comparator.comparing(input::indexOf));

        Arrays.stream(input.split(usePattern.toString()))
                .forEach(x -> parts.put(x, "TEXT(\"" + x + "\")"));

        usePattern.matcher(input).results()
                .forEach(x -> parts.put(x.group(), "FORMAT(\"" + x.group() + "\")"));

        parts.forEach((x, y) -> builder.append(y));

        return builder.toString();
    }
}