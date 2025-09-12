package DynamicProgramming;

public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[n + 1];
        int num = Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = num;

        for(int i =2; i < n + 1; i++) {
            int option1 = nums[i] + dp[i - 2]; // picking
            int option2 = dp[i-1];
            dp[i] = Math.max(option1, option2);
        }
        return dp[n];
    }
}
