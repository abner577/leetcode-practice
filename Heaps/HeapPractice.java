package Heaps;

import java.util.*;

public class HeapPractice {
    public int returnMin(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i : array) list.add(i);

        List<Integer> result = new ArrayList<>();

        // Default = minHeap
        // Collections.reverseOrder to make a maxHeap
        PriorityQueue<Integer> minHeap1 = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a, b));

        // maxHeaps
        PriorityQueue<Integer> maxHeap1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
        minHeap.addAll(list);

        while(!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        // Dealing with frequency maps as input for our heaps
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 3);
        hashMap.put(2, 5);
        hashMap.put(3, 7);

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap2 = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(), b.getValue()));

        return minHeap.peek();
    }
}
