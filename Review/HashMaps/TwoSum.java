package Review.HashMaps;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i =0; i < array.length; i++){
            int complement = target - array[i];
            if(hashMap.containsKey(complement)) {
                return new int[] {i, hashMap.get(complement)};
            }
            hashMap.put(array[i], i);
        }
        return new int[0];
    }
}
