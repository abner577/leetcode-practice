package Review.Heaps;

import java.util.*;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {
        Integer[] nums1 = new Integer[nums.length];
        for(int i =0; i < nums.length; i++) nums1[i] = Integer.valueOf(nums[i]);

        List<Integer> list = Arrays.asList(nums1);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(list);

        for(int i =0; i < k -1; i++) maxHeap.poll();
        return maxHeap.peek();
    }
}
