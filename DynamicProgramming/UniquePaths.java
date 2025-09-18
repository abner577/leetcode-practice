package DynamicProgramming;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++) {
                // dont want to override base case, just continue
                if(i == 0 && j == 0) continue;

                int paths = 0;
                // if we arent at an edge where we can go out of bounds
                if(i > 0) paths += dp[i -1][j];
                if(j > 0) paths += dp[i][j -1];
                dp[i][j] = paths;
            }
        }
        return dp[m-1][n-1];
    }
}
