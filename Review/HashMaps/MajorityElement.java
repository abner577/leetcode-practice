package Review.HashMaps;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i =0; i < nums.length; i++) {
            int cur = nums[i];
            hashMap.put(cur, hashMap.getOrDefault(cur, 0) + 1);

            if(hashMap.get(cur) > nums.length / 2) return cur;
        }
        return 0;
    }
}
