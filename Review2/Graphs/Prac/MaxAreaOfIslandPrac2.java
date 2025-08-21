package Review2.Graphs.Prac;

public class MaxAreaOfIslandPrac2 {

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, grid));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
                || grid[i][j] != 1) return 0;

        grid[i][j] = 0;
        return 1 +
                dfs(i + 1, j, grid) +
                dfs(i - 1, j, grid) +
                dfs(i, j + 1, grid) +
                dfs(i, j - 1, grid);
    }
}
