package Review2.Graphs;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++){
                if(grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, grid, maxArea));
                }
            }
        }
        return maxArea;
    }
    public int dfs(int i, int j, int[][] grid, int maxArea) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
                || grid[i][j] != 1) return 0;

        grid[i][j] = 0;
        // 1 + represents adding the current node, we can do this because if we got to this point we know its a 1
        maxArea = 1 +
                dfs(i + 1, j , grid, maxArea) +
                dfs(i - 1, j , grid, maxArea) +
                dfs(i, j + 1 , grid, maxArea) +
                dfs(i, j - 1, grid, maxArea);
        return maxArea;
    }
}
