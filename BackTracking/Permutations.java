package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        backtrack(0, nums, result, sol);
        return result;
    }

    private static void backtrack(int i, int[] nums, List<List<Integer>> result, List<Integer> sol) {
        if(sol.size() == nums.length){
            result.add(new ArrayList<>(sol));
            return;
        }

        for(int j = 0; j < nums.length; j++){
            if(!sol.contains(nums[j])){
                sol.add(nums[j]);
                backtrack(i +1, nums, result, sol);
                sol.removeLast();
            }
        }
    }
}
