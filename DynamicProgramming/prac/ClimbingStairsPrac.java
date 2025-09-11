package DynamicProgramming.prac;

import java.util.HashMap;

public class ClimbingStairsPrac {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);


        for(int i =4; i < n; i++) {
            map.put(i, map.get(i - 2) + map.get(i - 1));
        }
        return map.get(n);
    }
}
