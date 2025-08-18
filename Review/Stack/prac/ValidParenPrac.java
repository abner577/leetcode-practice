package Review.Stack.prac;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenPrac {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        hashMap.put(')','(');
        hashMap.put(']','[');
        hashMap.put('}','{');

        for(int i =0; i < s.length(); i++){
            // if its not a key, i.e. if its a value (opening)
            if(!hashMap.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
                        // else its a closing
            } else {
                if(stack.isEmpty()) return false; //if we try closing with no opening before, false
                else {
                    char popped = stack.pop();
                    if(popped != hashMap.get(s.charAt(i))) return false; // if the opening we popped off isnt equal to the val of the closing at i
                }
            }
        }
        return stack.isEmpty();
    }
}
