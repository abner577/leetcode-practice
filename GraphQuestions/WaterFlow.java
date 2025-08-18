package GraphQuestions;

import java.util.*;

public class WaterFlow {
    public static void main(String[] args) {

    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Queue<Integer> p_QUEUE = new LinkedList<>();
        Queue<Integer> a_QUEUE = new LinkedList<>();
        HashSet<Integer> p_SET = new HashSet<>();
        HashSet<Integer> a_SET = new HashSet<>();
        List<List<Integer>> re = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;

        for(int i =0; i < n; i++){  // pacific top
            p_QUEUE.add(heights[0][i]);
            p_SET.add(heights[0][i]);
        }
        for(int i = 1; i < m; i++){  // pacific left
            p_QUEUE.add(heights[i][0]);
            p_SET.add(heights[i][0]);
        }

        for(int i =0; i < n; i++){  // atlantic bottom
            a_QUEUE.add(heights[m-1][i]);
            a_SET.add(heights[m-1][i]);
        }
        for(int i = 1; i < m; i++){  // atlantic right
            a_QUEUE.add(heights[i][n-1]);
            a_SET.add(heights[i][n-1]);
        }
        return re;
    }
    public HashSet<HashSet<Integer>> getValidCoords(Queue<int[]> queue, Set<String> seen){
        HashSet<HashSet<Integer>> coords = new HashSet<>();
        while(!queue.isEmpty()){
            int[] coord = queue.poll();
            int i = coord[0];
            int j = coord[1];
            seen.add(i + "," + j);
        }


        return coords;
    }
}
