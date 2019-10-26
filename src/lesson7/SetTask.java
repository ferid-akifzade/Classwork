package lesson7;
import java.util.*;


class StringGenerator{
    private Random sizeGenerator = new Random();
    private Random charGenerator = new Random();
    ArrayList<Character> charArray = new ArrayList<>();
    private String result = "";
    private String stringGenerator(Integer minSize, Integer maxSize)
    {
        result = "";
        Integer size = Math.abs(sizeGenerator.nextInt()%(maxSize-minSize+1)) + minSize;
        while (size-- != 0)
            result += (char) (charGenerator.nextInt() % 90 + 36);
        return result;
    }

    public HashMap<Integer, String> generate(Integer minSize, Integer maxSize)
    {
        HashMap<Integer, String> result = new HashMap<>();
        Integer size = maxSize - minSize;
        while (size-- != 0) {
            String generated = stringGenerator(minSize,maxSize);
            result.put(size, generated);
        }
        return result;
    }

}

class randomNumberGenerator{

    public HashSet<Integer> generate()
    {
        Random numberRandom = new Random();
        HashSet<Integer> randomNumberSet = new HashSet<>();
        HashMap<Integer, String> randomStringMap = new HashMap<>();

        do {
            randomNumberSet.add(numberRandom.nextInt() % 11);
        }while (randomNumberSet.size() < 20);
        return randomNumberSet;
    }

}

public class SetTask {

    public static void main(String[] args) {
        randomNumberGenerator numberGenerator = new randomNumberGenerator();
        StringGenerator generator = new StringGenerator();

        numberGenerator.generate();
        HashMap<Integer, String> generatedStringMap = generator.generate(10,20);

        ArrayList<String> generatedString = new ArrayList<String> (generatedStringMap.values());
        generatedString = (ArrayList<String>) generatedString;
        int len_min = Integer.MAX_VALUE;
        int len_max = Integer.MIN_VALUE;
        for (String value : generatedString) {
            if(value.length() > len_max)
                len_max = value.length();
            if(value.length() < len_min)
                len_min = value.length();
        }
        System.out.println("Max : "+ len_max + " Min : " + len_min);

    }
}
