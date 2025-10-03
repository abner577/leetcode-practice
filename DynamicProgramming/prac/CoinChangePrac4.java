package DynamicProgramming.prac;

public class CoinChangePrac4 {

    public int coinChange(int[] coins, int amount) {
        int n = amount + 1;
        int[] dp = new int[n];
        dp[0] = 0;

        for(int i =1; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for(int coin : coins) {
                int diff = i - coin;
                if(diff < 0) continue;

                if(dp[diff] != Integer.MAX_VALUE) {
                    min = Math.min(min, dp[diff] + 1);
                }
            }
            dp[i] = min;
        }
        if(dp[amount] != Integer.MAX_VALUE) return dp[amount];
        else return -1;
    }
}
