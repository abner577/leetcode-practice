package Review.Heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {

    }
    public int lastStoneWeight(int[] stones) {
        Integer[] stones1 = new Integer[stones.length];

        for(int i =0; i < stones1.length; i++){
            stones1[i] = Integer.valueOf(stones[i]);
        }
        List<Integer> list = Arrays.asList(stones1);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.addAll(list);

        while(maxHeap.size() > 1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if(x != y) {
                int newY = y - x;
                maxHeap.add(newY);
            }
        }
        if(maxHeap.isEmpty()) return 0;
        else return maxHeap.poll();
    }
}
