package HashMapsAndSets;

import java.util.HashMap;
import java.util.HashSet;

public class JewelsStones {
    public static void main(String[] args) {

    }
    public static int numOfJewels(String jewels, String stones) {
        HashSet<Character> hashSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            hashSet.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (hashSet.contains(stones.charAt(i))) count++;
        }
        return count;
    }
}
