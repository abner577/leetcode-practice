package DynamicProgramming.prac;

public class MaximumSubArrayPrac {

    // rule: if sum is negative reset it
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i < n; i++) {
            curSum += nums[i];
            maxSum = Math.max(curSum, maxSum);
            if(curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}
