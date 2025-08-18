package HashMapsAndSets;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums){
        if(nums.length == 1) return false;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i =0; i < nums.length; i++){
            if(hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }
}
