package Review2.Graphs;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islands = 0;
        boolean[] visited = new boolean[grid.length];
        int m = grid.length; // # of rows
        int n = grid[0].length; // # of columns

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(grid[i][j] == '1') {
                    islands++;
                    dfs(i, j, grid);
                }
            }
        }
        return islands;
    }

    public void dfs(int i, int j, char[][] grid) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
                || grid[i][j] != '1') return;
        // mark each 1 as 'visited' so we dont re-count it
        else {
            grid[i][j] = '0';
            dfs(i + 1, j, grid);
            dfs(i - 1, j, grid);
            dfs(i , j + 1, grid);
            dfs(i, j - 1, grid);
        }
    }
}
