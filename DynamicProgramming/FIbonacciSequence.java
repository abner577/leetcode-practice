package DynamicProgramming;

import java.util.HashMap;

public class FIbonacciSequence {

    // Top Down approach
    public int fib(int n) {
        var memo = new HashMap<Integer, Integer>();
        memo.put(0, 0);
        memo.put(1, 1);
        return helper(n, memo);
    }

    public int helper(int x, HashMap<Integer, Integer> memo) {
        if(memo.containsKey(x)) return memo.get(x);
        else {
            memo.put(x, helper(x -2, memo) + helper(x - 1, memo));
            return memo.get(x);
        }
    }

    // Bottom up approach

    public int fib1(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i =2; i < n + 1; i++) {
            dp[i] = dp[i -2] + dp[i - 1];
        }
        return dp[n];
    }
}
