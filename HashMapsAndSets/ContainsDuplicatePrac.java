package HashMapsAndSets;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicatePrac {
    public static void main(String[] args) {

    }
    public static boolean contains(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i =0; i < nums.length; i++){
            if(hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }
}
