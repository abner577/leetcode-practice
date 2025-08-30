package Review2.Graphs;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class MinCostToConnectAllPoints {

    public int minCostConnectPoints(int[][] points) {
     int totalCost = 0;
     int n = points.length;
     Set<Integer> visited = new HashSet();

     // first num is the distance, second is the index, so for example
        // the first index of points is the first [x,y] pair
     PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
     minHeap.offer(new int[]{0,0});

     while(visited.size() < points.length) {
         int[] curMin = minHeap.poll();
         int cost = curMin[0];
         int curIndex = curMin[1];

         if(!visited.contains(curIndex)) {
             visited.add(curIndex);
             totalCost += cost;

             for(int i =0; i < n; i++) {
                 if(!visited.contains(i)) {
                     int dist = manhattan(points[curIndex], points[i]);
                     minHeap.offer(new int[]{dist, i});
                 }
             }
         }
      }
     return totalCost;
    }
    private int manhattan(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}
