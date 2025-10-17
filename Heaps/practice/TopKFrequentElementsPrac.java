package Heaps.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsPrac {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for(int i =0; i < nums.length; i++) {
            int prevValue = map.getOrDefault(nums[i], 0);
            map.put(nums[i], prevValue + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        for(int i =0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            result[i] = entry.getKey();
        }
        return result;
    }
}
