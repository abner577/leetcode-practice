package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        List<Integer> stonesList = new ArrayList<>();
        for(int stone : stones) stonesList.add(stone);

        // max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(stonesList);

        while(!maxHeap.isEmpty()) {
            if(maxHeap.size() == 1) return maxHeap.peek();

            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if(x == y) continue;
            else if (x != y) {
                int newStone = y - x;
                maxHeap.add(newStone);
            }
        }
        return 0;
    }
}
