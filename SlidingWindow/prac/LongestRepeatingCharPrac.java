package SlidingWindow.prac;

public class LongestRepeatingCharPrac {
    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int longest = 0;
        int maxFreq = 0;
        int[] array = new int[26];

        for(int i =0; i < s.length(); i++){
            char currentLetter = s.charAt(right);
            array[currentLetter - 'A']++;
            maxFreq = Math.max(maxFreq, array[currentLetter - 'A']);

            while((right - left + 1) - maxFreq > k){
                array[s.charAt(left) - 'A']--;
                left++;
            }

            int distance = right - left + 1;
            longest = Math.max(distance, longest);
            right++;
        }
        return longest;
    }
}
