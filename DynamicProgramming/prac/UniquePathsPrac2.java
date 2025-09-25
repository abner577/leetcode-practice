package DynamicProgramming.prac;

public class UniquePathsPrac2 {

    // so dp array is going to represent how many unqiue paths we cna take to get there
    // so top row is just 1 way, we just go striaght right
    // the leftmost column is just 1 way, we just go straight down
    // The 2 ways we can get to a square is by first going right then down, then down and right
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(i == 0 && j == 0) continue;
                if(i == 0) {
                    dp[i][j] =0 + dp[i][j-1];
                    continue;
                }
                if(j == 0) {
                    dp[i][j] = dp[i-1][j] + 0;
                    continue;
                }

                int paths = 0;
                paths = dp[i - 1][j] + dp[i][j - 1];
                dp[i][j] = paths;
            }
        }
        return dp[m-1][n-1];
    }
}
