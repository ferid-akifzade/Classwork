package lesson6;

import java.util.ArrayList;
import java.util.Random;

public class Warmup {
    public static void main(String[] args) {
        ArrayList<Integer> firstNumberArray = new ArrayList<>();
        Random fillArray = new Random();
        for (int i = 0; i < 100; i++) {
            Integer randomNumber = Math.abs(fillArray.nextInt()) % 100;
            firstNumberArray.add(randomNumber);
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer integerInFirstArray: firstNumberArray) {
            if(integerInFirstArray % 2 == 0) {
                evenNumbers.add(integerInFirstArray);
                continue;
            }
            oddNumbers.add(integerInFirstArray);
        }

        firstNumberArray.forEach(item ->{System.out.print(item+ ", "); });
        System.out.println();
        evenNumbers.forEach(item ->{System.out.print(item+ ", "); });
        System.out.println();
        oddNumbers.forEach(item ->{System.out.print(item+ ", "); });
        System.out.println();
    }
}
