package SlidingWindow;

public class LongestRepeatingCharReplacementt {
    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int[] freq = new int[26];
        int longest = 0;
        int maxFreq = 0;

        for(int i =0; i < s.length(); i++){
            char current = s.charAt(right);
            freq[current - 'A']++;
            maxFreq = Math.max(maxFreq, freq[current - 'A']); // most common char

            while((right - left + 1) - maxFreq > k){ //while size of window - most common char
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(longest, right - left + 1);
            right++;
        }
        return longest;
    }
}
