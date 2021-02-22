package exam03retake01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer>

    public int getNumberOfOwls(String zala) {
    return ;}

    public void readFromFile(BufferedReader reader) {

        try (BufferedReader reader1 = Files.newBufferedReader(Path.of("owls.txt"))) {
            new FileReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
