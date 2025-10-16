package Heaps.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementPrac {

    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(list);

        for(int i =0; i < k - 1; i++) maxHeap.poll();
        return maxHeap.peek();
    }
}
