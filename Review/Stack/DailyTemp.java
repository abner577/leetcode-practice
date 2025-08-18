package Review.Stack;

import java.util.HashMap;
import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {

    }
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temp.length];

        for(int i =0; i < temp.length; i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return answer;
    }
}
