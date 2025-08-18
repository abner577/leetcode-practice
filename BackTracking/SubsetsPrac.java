package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsPrac {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        backtrack(0, result, sol, nums);
        return result;
    }

    private static void backtrack(int i, List<List<Integer>> result, List<Integer> sol, int[] nums) {
        if(i == nums.length){
            result.add(new ArrayList<>(sol));
            return;
        }
        //dont choose
        backtrack(i+1, result, sol, nums);

        //choose
        sol.add(nums[i]);
        backtrack(i+1, result, sol, nums);
        sol.removeLast();
    }

}
