package Review.Heaps;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] answer = new int[k];

        for(int i=0; i < nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        maxHeap.addAll(hashMap.entrySet());

        for(int i =0; i < k; i++){
            answer[i] = maxHeap.poll().getKey();
        }
        return answer;
    }
}
