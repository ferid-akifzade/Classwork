package lesson5;


import java.util.Random;
import java.lang.Math;
public class main {
    public static void main(String[] args) {

        Random arrayElements = new Random(10);
        String[] arrayOfFizzAndBuzz = new String[20];
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            String result = "";
            array[i] = Math.abs(arrayElements.nextInt());
            if(array[i]%2 == 0)
                result += "fizz";

            if (array[i] %3 == 0)
                result += "buzz";

            arrayOfFizzAndBuzz[i] = result;
        }
    }
}
