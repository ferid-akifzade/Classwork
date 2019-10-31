package lesson9;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSorter {

    ArrayList<String> sort(ArrayList<String> source)
    {
        source.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });
        return source;
    }
}
