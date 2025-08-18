package TwoPointers;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] array, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i =0; i < array.length; i++){
            int complement = target - array[i];
            if(hashMap.containsKey(complement)){
                return new int[] {hashMap.get(complement), i};
            }
            hashMap.put(array[i], i);
        }
        return array;
    }
}
