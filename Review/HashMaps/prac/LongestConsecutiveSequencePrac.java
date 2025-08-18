package Review.HashMaps.prac;

import java.util.HashSet;

public class LongestConsecutiveSequencePrac {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;

        for(int i =0; i < nums.length; i++) set.add(nums[i]);

        for(int num : nums){
            if(!set.contains(num - 1)){
                int length = 1;

                while(set.contains(num + 1)){
                    length++;
                    num++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
