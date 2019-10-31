package lesson9;

import java.util.ArrayList;

public class ListGenerator {
    private ArrayList<String> builtList = new ArrayList<>();
    private StringGenerator generator = new StringGenerator();

    ArrayList<String> generate(int size)
    {
        while (size-- != 0)
            builtList.add(generator.generate(10,30));

        return builtList;
    }
}
