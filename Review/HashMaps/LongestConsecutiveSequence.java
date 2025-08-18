package Review.HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int sum = left + right + 1;

                // Update the max length
                max = Math.max(max, sum);

                // Update the current number's value
                map.put(num, sum);

                // Update the boundary values of the sequence
                map.put(num - left, sum);
                map.put(num + right, sum);
            }
            // If already in map, skip to avoid reprocessing
        }

        return max;
    }
    }

