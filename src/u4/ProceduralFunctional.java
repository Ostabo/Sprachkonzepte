package u4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class ProceduralFunctional {
    private ProceduralFunctional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get(args[0]));

        long start = System.nanoTime();

        int n = input.lines()
                .filter(s -> !s.isEmpty())
                .filter(s -> s.length() >= MIN_LENGTH)
                .mapToInt(String::length)
                .sum();

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

}