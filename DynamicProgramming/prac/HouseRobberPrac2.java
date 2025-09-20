package DynamicProgramming.prac;

public class HouseRobberPrac2 {

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        for(int i = 2; i < n; i++) {
            int option1 = dp[i - 1];
            int option2 = dp[i - 2] + nums[i];
            dp[i] = Math.max(option1, option2);
        }
        return dp[n - 1];
    }
}
