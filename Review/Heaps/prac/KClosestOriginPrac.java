package Review.Heaps.prac;

import java.util.*;

public class KClosestOriginPrac {
    public static void main(String[] args) {

    }
    public int[][] kClosest(int[][] points, int k) {
        int[][] answer = new int[k][2];

        //Make our priority queue put min distances at the top
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                Comparator.comparingDouble(p ->  Math.sqrt(p[0] * p[0] + p[1] * p[1]))
        );

        // Add all ordered pairs to the heap
        for(int i =0; i < points.length; i++){
            minHeap.add(points[i]);
        }

        //Remove k ordered pairs from the top and put it into answers
        for(int i =0; i < k; i++){
            answer[i] = minHeap.poll();
        }
        return answer;
    }
}
