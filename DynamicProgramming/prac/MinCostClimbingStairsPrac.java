package DynamicProgramming.prac;

public class MinCostClimbingStairsPrac {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i =2; i < n + 1; i++) {
            int option1 = cost[i - 2] + dp[i - 2];
            int option2 = cost[i - 1] + dp[i - 1];
            dp[i] = Math.min(option1, option2);
        }
        return dp[n];
    }
}
