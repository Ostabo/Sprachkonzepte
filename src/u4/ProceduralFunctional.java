package u4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public final class ProceduralFunctional {
    private ProceduralFunctional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get(args[0]));

        long start = System.nanoTime();

        var inList = readLines(input);
        var emptiedList = removeEmptyLines(inList);
        var shortenedList = removeShortLines(emptiedList);
        int n = totalLineLengths(shortenedList);

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    private static List<String> readLines(BufferedReader input) {
        return input.lines().toList();
    }

    private static List<String> removeEmptyLines(List<String> lines) {
        return lines.stream().filter(s -> !s.isEmpty()).toList();
    }

    private static List<String> removeShortLines(List<String> lines) {
        return lines.stream().filter(s -> s.length() >= MIN_LENGTH).toList();
    }

    private static int totalLineLengths(List<String> lines) {
        return lines.stream().mapToInt(String::length).sum();
    }

} 