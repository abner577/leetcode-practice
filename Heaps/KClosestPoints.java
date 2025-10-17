package Heaps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPoints {

    public int[][] kClosest(int[][] points, int k) {
        HashMap<int[], Integer> map = new HashMap<>();
        int[][] result = new int[k][2];


        for(int[] point : points) {
            Integer distance = point[0] * point[0] + point[1] * point[1];
            map.put(point, distance);
        }

        PriorityQueue<Map.Entry<int[], Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<int[], Integer> entry : map.entrySet()) {
            minHeap.add(entry);
        }

        for(int i =0; i < k; i++) {
            Map.Entry<int[], Integer> entry = minHeap.poll();
            result[i] = entry.getKey();
        }
        return result;
    }
}
