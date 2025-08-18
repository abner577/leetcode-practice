package Review.Stack.prac;

import java.util.Stack;

public class RPNprac {
    public static void main(String[] args) {

    }
    public int evalRPN(String[] tokens) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i < tokens.length; i++){
            if(tokens[i].equals("+")) {
                int last = stack.pop();
                int secondLast = stack.pop();
                int newScore = secondLast + last;
                stack.push(newScore);
            }
            else if (tokens[i].equals("-")){
                int last = stack.pop();
                int secondLast = stack.pop();
                int newScore = secondLast - last;
                stack.push(newScore);
            }
            else if (tokens[i].equals("*")){
                int last = stack.pop();
                int secondLast = stack.pop();
                int newScore = secondLast * last;
                stack.push(newScore);
            }
            else if (tokens[i].equals("/")){
                int last = stack.pop();
                int secondLast = stack.pop();
                int newScore = secondLast / last;
                stack.push(newScore);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        while(!stack.isEmpty()) sum += stack.pop();
        return sum;
    }
}
