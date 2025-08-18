package Review.TwoPointers;

import java.util.HashMap;

public class TwoSumII {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] array, int target){
        int left = 0;
        int right = array.length -1;

        while(left < right){
            int sum = array[left] + array[right];

            if(sum == target) return new int[] {left + 1, right + 1};
            else if (sum < target) left++;
            else right--;

        }
        return new int[] {};
    }
}
