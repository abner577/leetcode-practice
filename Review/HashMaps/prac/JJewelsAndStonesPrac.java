package Review.HashMaps.prac;

import java.util.HashMap;

public class JJewelsAndStonesPrac {
    public static void main(String[] args) {

    }
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int counter = 0;

        for(int i =0; i < jewels.length(); i++) hashMap.put(jewels.charAt(i), i);

        for(int i =0; i < stones.length(); i++){
            if(hashMap.containsKey(stones.charAt(i))) counter ++;
        }
        return counter;
    }
}
