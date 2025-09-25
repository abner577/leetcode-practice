package DynamicProgramming.prac;

public class CoinChangePrac {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for(int i =1; i < amount + 1; i++) {
            int min = Integer.MAX_VALUE;

            for(int coin : coins) {
                int diff = i - coin;

                // if the coin is greater than the i, skip this, need the coin to be less than i
                if(diff < 0) continue;
                else {
                    if(dp[diff] != Integer.MAX_VALUE) min = Math.min(min, dp[diff] + 1);
                }
            }
            dp[i] = min;
        }
        if(dp[amount] != Integer.MAX_VALUE) return dp[amount];
        else return -1;
    }

}
