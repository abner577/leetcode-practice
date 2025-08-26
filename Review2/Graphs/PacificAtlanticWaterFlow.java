package Review2.Graphs;

import java.util.*;

public class PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<Integer[]> pacificQueue = new LinkedList<>();
        Queue<Integer[]> atlanticQueue = new LinkedList<>();
        Set<String> pSeen = new HashSet<>();
        Set<String> aSeen = new HashSet<>();

        int m = heights.length; // rows
        int n = heights[0].length; // columns

        // adding top row (pacific)
        for(int i =0; i < n; i++) {
            Integer[] cur = {0, i};
            pacificQueue.add(cur);
            pSeen.add(0 + "," + i);
        }

        // adding leftmost column (pacific)
        for(int i =1; i < m; i++) {
            Integer[] cur = {i, 0};
            pacificQueue.add(cur);
            pSeen.add(i + "," + 0);
        }

        // adding rightmost column (atlantic)
        for(int i =0; i < m; i++) {
            Integer[] cur = {i, n - 1};
            int j = n -1;
            atlanticQueue.add(cur);
            aSeen.add(i + "," + j);
        }

        // adding bottom row (atlantic)
        for(int i =0; i < n - 1; i++) {
            Integer[] cur = {m - 1, i};
            int j = m - 1;
            atlanticQueue.add(cur);
            aSeen.add(j + "," + i);
        }

        getCoordinates(pacificQueue, pSeen, heights);
        getCoordinates(atlanticQueue, aSeen, heights);

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                String key = i + "," + j;
                if (pSeen.contains(key) && aSeen.contains(key)) {
                    answer.add(Arrays.asList(i, j));  // List<List<Integer>>
                }
            }
        }

        return answer;
    }

    public Set<Integer[]> getCoordinates(Queue<Integer[]> queue, Set<String> seenSet, int[][] heights) {
        Set<Integer[]> coordinates = new HashSet<>();
        int[][] directions = {{0,1}, {1,0}, {-1, 0}, {0, -1}};

        while(!queue.isEmpty()) {
            Integer[] cur = queue.poll();
            int i = cur[0]; // row
            int j = cur[1]; // column
            coordinates.add(new Integer[]{i, j});

            for(int[] dir: directions) {
                int r = i + dir[0];
                int c = j + dir[1];

                if(r >= 0 && r < heights.length && c >= 0 && c < heights[0].length
                && heights[r][c] >= heights[i][j] && !seenSet.contains(heights[r][c])) {
                    Integer[] newAddition = new Integer[]{r, c};
                    String key = r + "," + c;
                    seenSet.add(key);
                    queue.add(newAddition);
                }
            }
        }
        return coordinates;
    }
}
