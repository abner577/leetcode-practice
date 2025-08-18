package Review.HashMaps.prac;

import java.util.HashMap;

public class ContainsDuplicatePrac {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i =0; i < nums.length; i++) {
           if(hashMap.containsKey(nums[i])) return true;
           hashMap.put(nums[i], i);
        }
        return false;
    }
}
