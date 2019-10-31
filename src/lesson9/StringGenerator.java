package lesson9;

import java.util.Random;

public class StringGenerator
{
    String generate(int minSize, int maxSize)
    {
        Random sizeGenerator = new Random();
        String result = "";
        int size = Math.abs(sizeGenerator.nextInt())%(maxSize- minSize) + minSize;
        for (int i = 0; i < size; i++) {
            Random charGenerator = new Random();
            int ch = Math.abs(charGenerator.nextInt())%57 + 65;
            if(ch<90 || ch>97)
            {
                result += (char)ch;
            }
            else i--;
        }
        return result;
    }
}