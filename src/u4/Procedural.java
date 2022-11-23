package u4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;

public final class Procedural {
    private Procedural() { }

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
        for (var it = lines.iterator(); it.hasNext(); ) {
            if (it.next().isEmpty()) {
                it.remove();
            }
        }
    }

    private static void removeShortLines(List<String> lines) {
        for (var it = lines.iterator(); it.hasNext(); ) {
            if (it.next().length() < MIN_LENGTH) {
                it.remove();
            }
        }
    }

    private static int totalLineLengths(List<String> lines) {
        int n = 0;
        for (var it = lines.iterator(); it.hasNext(); ) {
            n += it.next().length();
        }
        return n;
    }

} 