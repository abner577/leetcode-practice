package HashMapsAndSets;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        double n = nums.length;
        for(int i =0; i < n; i++){
            int num = nums[i];
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

            if(hashMap.get(num) > n/2) return num;
        }
        return 0;
    }
}
