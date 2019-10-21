package lesson5;


import java.util.Random;
import java.lang.Math;
public class main {
    public static void main(String[] args) {

        Random arrayElements = new Random(10);
        String[] arrayOfFizzAndBuzz = new String[20];
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Math.abs(arrayElements.nextInt());
            if(array[i] %2 == 0 && array[i] %3 == 0) {
                arrayOfFizzAndBuzz[i] = "fizzbuzz";
                continue;
            }
            if(array[i]%2 == 0) {
                arrayOfFizzAndBuzz[i] = "fizz";
                continue;
            }
            else if (array[i] %3 == 0) {
                arrayOfFizzAndBuzz[i] = "buzz";
                continue;
            }
            arrayOfFizzAndBuzz[i] = "";
            continue;
        }
    }
}
