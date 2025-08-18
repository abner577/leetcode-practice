package Review.HashMaps;

import java.util.HashMap;

public class MaxNumOfBalloons {
    public static void main(String[] args) {

    }
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int balloons = 0;

        for(int i =0; i < text.length(); i++){
            char c = text.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

            while(hashMap.getOrDefault('b', 0) >= 1 &&
                    hashMap.getOrDefault('a', 0) >= 1 &&
                    hashMap.getOrDefault('l', 0) >= 2 &&
                    hashMap.getOrDefault('o', 0) >= 2 &&
                    hashMap.getOrDefault('n', 0) >= 1) {

                balloons++;
                hashMap.put('b', hashMap.get('b') - 1);
                hashMap.put('a', hashMap.get('a') - 1);
                hashMap.put('l', hashMap.get('l') - 2);
                hashMap.put('o', hashMap.get('o') - 2);
                hashMap.put('n', hashMap.get('n') - 1);
            }

        return balloons;
    }
}
