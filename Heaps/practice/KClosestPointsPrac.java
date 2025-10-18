package Heaps.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointsPrac {

    public int[][] kClosest(int[][] points, int k) {
        HashMap<int[], Integer> map = new HashMap<>();
        int[][] result = new int[k][2];

        for(int[] point : points) {
            int x1 = point[0];
            int y1 = point[1];
            Integer distance = (int) Math.sqrt(x1 * x1 + y1 * y1);
            map.put(point, distance);
        }

        PriorityQueue<Map.Entry<int[], Integer>> minHeap =
                new PriorityQueue<>((a,b) ->
                        a.getValue() - b.getValue());

        for(Map.Entry<int[], Integer> entry : map.entrySet()) minHeap.add(entry);

        for(int i =0; i < k; i++) {
            Map.Entry<int[], Integer> entry = minHeap.poll();
            result[i] = entry.getKey();
        }
        return result;
    }
}
