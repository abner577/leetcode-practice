package Review.Stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {

    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(int i =0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                int last = stack.pop();
                int secondLast = stack.pop();
                int newInt = secondLast + last;

                stack.push(newInt);
            }
             else if (tokens[i].equals("-")) {
                int last = stack.pop();
                int secondLast = stack.pop();
                int newInt = secondLast - last;

                stack.push(newInt);
            }
            else if (tokens[i].equals("*")) {
                int last = stack.pop();
                int secondLast = stack.pop();
                int newInt = secondLast * last;

                stack.push(newInt);
            }
            else if (tokens[i].equals("/")) {
                int last = stack.pop();
                int secondLast = stack.pop();
                int newInt = secondLast / last;

                stack.push(newInt);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        while(!stack.isEmpty()) sum += stack.pop();
        return sum;
    }
}
