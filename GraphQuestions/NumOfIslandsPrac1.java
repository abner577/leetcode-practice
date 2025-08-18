package GraphQuestions;

public class NumOfIslandsPrac1 {
    public static void main(String[] args) {

    }
    public static int numIslands(char[][] grid){
        int islands = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i =0; i < m; i++){
            for(int j =0; j < n; j++){
                if(grid[i][j] == '1') {
                    islands++;
                    dfs(i,j,grid);
                }
            }
        }
        return islands;
    }

    private static void dfs(int i, int j, char[][] grid) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
        else {
            grid[i][j] = '0';
            dfs(i +1, j, grid);
            dfs(i -1, j, grid);
            dfs(i, j + 1, grid);
            dfs(i, j - 1, grid);
        }
    }
}
