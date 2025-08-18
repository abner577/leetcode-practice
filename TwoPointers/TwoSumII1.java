package TwoPointers;

public class TwoSumII1 {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target){
        int left =0;
        int right = nums.length -1;

        while(left <= right){
            int sum = nums[left] + nums[right];
            if(sum > target){
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[] {left +1, right +1};
            }
        }
        return nums;
    }
}
