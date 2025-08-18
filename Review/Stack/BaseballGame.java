package Review.Stack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {

    }
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i < operations.length; i++){
            if(operations[i].equals("+")) {
                int last = stack.pop();
                int secondLast = stack.pop();
                int newScore = last + secondLast;

                stack.push(secondLast);
                stack.push(last);
                stack.push(newScore);
            } else if (operations[i].equals("D")) {
                int last = stack.pop();
                stack.push(last);
                stack.push(last * 2);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        while (!stack.isEmpty()) sum += stack.pop();
        return sum;
    }
}
