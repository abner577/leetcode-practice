package Review2.Graphs.Prac;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOrangesPrac {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int freshOranges = 0;
        int minutes = -1;
        Queue<int[]> rottenOranges = new LinkedList<>();
        int[][] directions = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(grid[i][j] == 2) rottenOranges.add(new int[] {i, j});
                else if (grid[i][j] == 1) freshOranges++;
            }
        }
        // at this point:
        // all rotten are in queue, we have total amnt of freshOranges
        if(freshOranges == 0) return 0;

        while(!rottenOranges.isEmpty()) {
            int size = rottenOranges.size();
            minutes++;

            for(int i =0; i < size; i++) {
                // We pop out rotten orange
                int[] cur = rottenOranges.poll();

                // need to set its fresh neighbors as rotten
                for(int[] dir : directions) {
                    int row = cur[0] + dir[0];
                    int col = cur[1] + dir[1];

                    if(row >= 0 && row < m && col >= 0 && col < n && grid[row][col] == 1) {
                        grid[row][col] = 2;
                        freshOranges--;
                        rottenOranges.add(new int[] {row, col});
                    }
                }
            }
        }
        if(freshOranges == 0) return minutes;
        else return -1;
    }
}
