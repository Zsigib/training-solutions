/*package exam03retake02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BalatonStorm {
    public <String> List<String> getStationsInStorm(BufferedReader reader) throws IOException {

        try (BufferedReader reader2 = Files.newBufferedReader(Path.of("storm.json"))) {
            new FileReader().readLines(reader2);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
*/