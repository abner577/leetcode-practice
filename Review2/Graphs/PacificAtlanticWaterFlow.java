package Review2.Graphs;

import java.util.*;

public class PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<Integer[]> pacificQueue = new LinkedList<>();
        Queue<Integer[]> atlanticQueue = new LinkedList<>();
        Set<Integer[]> pSeen = new HashSet<>();
        Set<Integer[]> aSeen = new HashSet<>();

        int m = heights.length; // rows
        int n = heights[0].length; // columns

        for(int i =0; i < n; i++) {
            Integer[] cur = {0, i};
            pacificQueue.add(cur);
        }

        for(int i =0; i < m; i++) {
            Integer[] cur = {i, 0};
            pacificQueue.add(cur);
        }
        return answer;
    }
}
