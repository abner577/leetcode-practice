package DynamicProgramming.prac;

public class UniquePathsPrac3 {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for(int i =0; i < m; i ++) {
            for(int j =0; j < n; j++) {
                int paths = 0;
                if(i == 0 && j == 0) continue;

                else if(i == 0) {
                    dp[i][j] = 0 + dp[i][j-1];
                    continue;
                }
                else if(j == 0) {
                    dp[i][j] = dp[i-1][j] + 0;
                    continue;
                }

                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
