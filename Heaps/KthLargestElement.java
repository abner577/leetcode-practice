package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElement {
    // Solving with a maxHeap
    public int findKthLargest(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(list);

        for(int i =0; i < k - 1; i++) maxHeap.poll();

        return maxHeap.peek();
    }

    // Solving with a minHeap
    public int findKthLargest1(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);


        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.addAll(list);


        for(int i = k; i < nums.length; i++) minHeap.poll();

        return minHeap.peek();
    }

}
