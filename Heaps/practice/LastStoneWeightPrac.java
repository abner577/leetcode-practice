package Heaps.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightPrac {

    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int stone : stones) list.add(stone);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(list);

        while(!maxHeap.isEmpty()) {
            if(maxHeap.size() == 1) return maxHeap.peek();

            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if(y != x) {
                int z = y - x;
                maxHeap.add(z);
            }
        }
        return 0;
    }
}
