package lesson5;


import java.util.Random;

public class main {
    static String randomArray()
    {
        Random arrayElements = new Random(10);
        int[] array = new int[20];
        for (int value: array) {
            if(value % 2 == 0)
                return "fizz";
            else if (value % 3 == 0)
                return "buzz";
        }
        return null;
    }
    public static void main(String[] args) {

        System.out.println(randomArray());
    }
}
