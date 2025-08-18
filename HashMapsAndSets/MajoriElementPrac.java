package HashMapsAndSets;

import java.util.HashMap;

public class MajoriElementPrac {
    public static void main(String[] args) {

    }
    public static int majorityE(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;

        for(int i =0; i < n; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            if(hashMap.get(nums[i]) > n /2) return nums[i];
        }
        return 0;
    }
}
