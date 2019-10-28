package lesson8;

import java.util.ArrayList;

class Task
{
    private String string = "";

    public Task(String string) {
        this.string = string;
    }
    private boolean isNumeric(String strings)
    {
        boolean result = false;
        char[] chArray = strings.toCharArray();
        for (char ch: chArray) {
            result = Character.isDigit(ch);
        }
        return result;
    }
    private ArrayList<String> split()
    {
        if(this.string != null) {
            ArrayList<String> result = new ArrayList<>();
            char[] chArray = this.string.toCharArray();
            String result1 = "";
            for (char ch : chArray) {
                if (ch != ' ')
                    result1 += ch;
                else {
                    result.add(result1);
                    result1 = "";
                }

            }
            result.add(result1);
            return result;
        }
        throw new NullPointerException("String in class cannot be null");
    }
    public Integer solve()
    {
        Integer sum = 0;
        ArrayList<String> taskSolver = split();
        for (String oneStr: taskSolver) {
            if(isNumeric(oneStr))
                sum+=Integer.parseInt(oneStr);
        }
        return sum;
    }

}

public class WarmUp1 {
    public static void main(String[] args) {
        Task task = new Task("1 2a 3");
        System.out.println(task.solve());
    }
    
}
