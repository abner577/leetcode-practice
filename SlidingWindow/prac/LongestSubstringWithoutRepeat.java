package SlidingWindow.prac;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {

    }
    public static int longestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int left =0;
        int right =0;
        int windowLength = 0;
        int windowLength1 = 0;

        for(int i =0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            right++;
            windowLength1 = right - left;
            windowLength = Math.max(windowLength, windowLength1);
        }
        return windowLength;
    }
}
