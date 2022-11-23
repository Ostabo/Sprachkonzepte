package u4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public final class ProceduralFunctional {
    private ProceduralFunctional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get(args[0]));
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        readLines(input, lines);
        removeEmptyLines(lines);
        removeShortLines(lines);
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    private static void readLines(BufferedReader input, List<String> lines) throws IOException {
        String line;
        while ((line = input.readLine()) != null) {
            lines.add(line);
        }
    }

    private static void removeEmptyLines(List<String> lines) {
        lines.removeIf(String::isEmpty);
    }

    private static void removeShortLines(List<String> lines) {
        lines.removeIf(s -> s.length() < MIN_LENGTH);
    }

    private static int totalLineLengths(List<String> lines) {
        return lines.stream().mapToInt(String::length).sum();
    }

} 