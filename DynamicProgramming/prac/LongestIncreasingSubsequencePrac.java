package DynamicProgramming.prac;

public class LongestIncreasingSubsequencePrac {

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;

        int[] dp = new int[n];
        for(int i =0; i < n; i++) dp[i] = 1;
        int maxLength = 0;

        for(int i =1; i < n; i++) {

            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
}
