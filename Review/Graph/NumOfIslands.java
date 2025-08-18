package Review.Graph;

import java.util.ArrayList;
import java.util.List;

public class NumOfIslands {
    public static void main(String[] args) {

    }
    public int numIslands(char[][] grid) {
        int m = grid.length; // # of rows
        int n = grid[0].length; // # of columns
        int numOfIslands = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j]== '1'){
                    numOfIslands++;
                   dfs(i, j, grid);
                }
            }
        }
        return numOfIslands;
    }
    public static void dfs(int i, int j, char[][] grid) {

        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
        else {
            grid[i][j] = '0';
            dfs(i, j+ 1, grid);
            dfs(i, j- 1, grid);
            dfs(i + 1, j, grid);
            dfs(i - 1, j, grid);
        }
    }
}
