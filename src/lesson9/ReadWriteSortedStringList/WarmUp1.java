package lesson9.ReadWriteSortedStringList;


import java.io.IOException;

public class WarmUp1 {
    public static void main(String[] args) throws IOException {
        TextFileGenerator writer = new TextFileGenerator();
        writer.generateTextFile();
        TextFileReader reader = new TextFileReader();
        ListSorter sorter = new ListSorter();

        writer.generateTextFile(sorter.sort(reader.read(writer.out)));
    }
}
