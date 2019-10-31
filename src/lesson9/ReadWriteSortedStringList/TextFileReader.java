package lesson9.ReadWriteSortedStringList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class TextFileReader {
    public ArrayList<String> read(Path filePath) throws IOException {
        ArrayList<String> readed = new ArrayList<>();
        readed  = (ArrayList<String>) Files.readAllLines(filePath);
        return readed;
    }
}
