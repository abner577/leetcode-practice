package SlidingWindow.prac;

import java.util.HashSet;
import java.util.Set;

public class LongetSubStringPrac1 {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int largest = 0;

        for(int i =0; i < s.length(); i++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int windowSize = (right - left) + 1;
            largest = Math.max(windowSize, largest);
            right++;
        }
        return largest;
    }
}
