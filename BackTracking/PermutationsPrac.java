package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsPrac {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        backtrack(0, res, sol, nums);
        return res;
    }

    private static void backtrack(int i, List<List<Integer>> res, List<Integer> sol, int[] nums) {
        if(sol.size() == nums.length){
            res.add(new ArrayList<>(sol));
            return;
        }

        for(int j =0; j < nums.length; j++){
            if(!sol.contains(nums[j])) {
                sol.add(nums[j]);
                backtrack(i+1, res, sol, nums);
                sol.removeLast();
            }
        }
    }
}
