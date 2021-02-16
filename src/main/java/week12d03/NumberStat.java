package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer>numbers;

    public int numberStat(List<Integer>numbers) {

        Path file = Path.of("numberstat.txt");
        try (BufferedReader br = Files.newBufferedReader(file)) {

            if (numbers.size() < 1) throw new IllegalArgumentException("Empty list");

            List<Integer> stat = null;
            for (int number : numbers) {
                if (!numbers.contains(number)) {
                    stat.add(number);
                    Collections.sort(stat);
                    throw new NullPointerException("Empty list");
                }
                return stat.get(0);
            }

        } catch (IOException e) {
            new IllegalStateException("Can't read file", e);
        }
    }
}