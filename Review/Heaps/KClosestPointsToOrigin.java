package Review.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;


public class KClosestPointsToOrigin {
    public static void main(String[] args) {

    }
    public int[][] kClosest(int[][] points, int k) {
        // Use a min-heap that stores the point and its distance
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                Comparator.comparingDouble(p -> Math.sqrt(p[0] * p[0] + p[1] * p[1]))
        );

        // Add all points to the heap
        for (int[] point : points) {
            minHeap.offer(point);
        }
        // Extract the k closest points
        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            answer[i] = minHeap.poll();
        }
        return answer;

    }
}
