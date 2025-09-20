package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int n = amount + 1;
        int[] dp = new int[n];
        dp[0] = 0;
        Arrays.sort(coins);

        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;

            // Try taking each coin last
            for (int coin : coins) {
                int diff = i - coin;

                if (diff < 0) continue;
                 else {
                    if (dp[diff] != Integer.MAX_VALUE) {
                        min = Math.min(min, dp[diff] + 1);
                    }
                }
            }

            dp[i] = min;  // either a real min or still Integer.MAX_VALUE
        }

        if (dp[amount] != Integer.MAX_VALUE) return dp[amount];
         else return -1;
    }
}
