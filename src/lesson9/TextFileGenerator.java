package lesson9;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextFileGenerator {
    private ListGenerator generator = new ListGenerator();
    Path out = Paths.get("notSortedFile.txt");
    public void generateTextFile(ArrayList<String> source) throws IOException {
     //   ArrayList<String> source = generator.generate(30);
        Files.write(out,source, Charset.defaultCharset());
    }
    public void generateTextFile() throws IOException {
        ArrayList<String> source = generator.generate(30);
        Path out = Paths.get("notSortedFile.txt");
        Files.write(out,source, Charset.defaultCharset());
    }
}
