package Review.Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(int i =0; i < s.length(); i++){
            // if opening paren, push it to stack (if its not a key, i.e. if its a value)
            if(!hashMap.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
                // else if its a closing paren, check if there is a matching open
            } else {
                if(stack.isEmpty()) return false;
                else {
                    if(stack.pop() != hashMap.get(s.charAt(i))) return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
