package Review.Stack.prac;

import java.util.Stack;

public class BaseballGamePrac {
    public static void main(String[] args) {

    }
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(int i =0; i < operations.length; i++){
            if(operations[i].equalsIgnoreCase("+")) {
                int last = stack.pop();
                int secondLast = stack.pop();
                int newInput = last + secondLast;

                stack.push(secondLast);
                stack.push(last);
                stack.push(newInput);
            } else if (operations[i].equalsIgnoreCase("D")){
                int last = stack.pop();
                int newSscore = last * 2;

                stack.push(last);
                stack.push(newSscore);
            } else if (operations[i].equalsIgnoreCase("C")){
                stack.pop();
            } else {
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        while(!stack.isEmpty()) sum += stack.pop();
        return sum;
    }
}
