package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> subsets(int[] nums){
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        backtrack(0, result, sol, nums);
        return result;
    }
    public static void backtrack(int i,  List<List<Integer>> result, List<Integer> sol, int[] nums){
        if(i == nums.length){
            result.add(new ArrayList<>(sol));
            return;
        }
        //we dont add nums[i]
        backtrack(i+1, result, sol, nums);

        //we add nums[i]
        sol.add(nums[i]);
        backtrack(i+1, result, sol, nums);
        sol.removeLast();
    }
}
