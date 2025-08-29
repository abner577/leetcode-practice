package Review2.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int minutes = -1;
        int numFresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};

        for(int i =0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(grid[i][j] == 0) queue.add(new int[]{i, j});
                else if (grid[i][j] == 1) numFresh++;
            }
        }

        if(numFresh == 0) return 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            minutes++;

            for(int i =0; i < size; i++) {
                int[] orange = queue.poll();

                for(int[] dir : directions) {
                    int r = orange[0] + dir[0];
                    int c = orange[1] + dir[1];

                    if(r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        numFresh--;
                        queue.add(new int[] {r, c});
                    }
                }

            }
        }
        if(numFresh == 0) return minutes;
        else return -1;
    }
}
