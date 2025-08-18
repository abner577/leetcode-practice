package SlidingWindow.prac;

public class LongestRepeatingCharReplacementPrac {
    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] array = new int[26];
        int longest = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            array[current - 'A']++;
            maxFreq = Math.max(maxFreq, array[current - 'A']);
            int windowSize = right - left + 1;

            while(windowSize - maxFreq > k){
                array[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
