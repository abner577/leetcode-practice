package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubWithoutRepeat {
    public static void main(String[] args) {

    }
    public static int length(String s){
        int left =0;
        int longest = 0;
        Set<Character> set = new HashSet<>();

        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            int windowLength = (right - left) +1;
            longest = Math.max(longest, windowLength);
            set.add(s.charAt(right));
        }
        return longest;
    }
}
