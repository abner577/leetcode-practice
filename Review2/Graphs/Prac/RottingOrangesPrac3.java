package Review2.Graphs.Prac;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOrangesPrac3 {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int minutes = -1;
        int freshOranges = 0;
        Queue<int[]> rottenOranges = new LinkedList<>();
        int[][] directions = { {1,0}, {-1, 0}, {0, 1}, {0, -1} };

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(grid[i][j] == 2) rottenOranges.add(new int[]{i, j});
                else if (grid[i][j] == 1) freshOranges++;
            }
        }

        if(freshOranges == 0) return 0;

        while(!rottenOranges.isEmpty()) {
            int size = rottenOranges.size();
            minutes++;

            for(int i = 0; i < size; i++) {
                int[] cur = rottenOranges.poll();

                for(int[] dir : directions) {
                    int r = cur[0] + dir[0];
                    int c = cur[1] + dir[1];

                    if(r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        freshOranges--;
                        rottenOranges.add(new int[] {r,c});
                    }
                }
            }
        }
        if(freshOranges == 0) return minutes;
        else return -1;
    }
}
