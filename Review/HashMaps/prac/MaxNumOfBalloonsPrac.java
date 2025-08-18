package Review.HashMaps.prac;

import java.util.HashMap;

public class MaxNumOfBalloonsPrac {
    public static void main(String[] args) {

    }
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int ballons = 0;

        for(int i =0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == 'b' || c == 'a' ||c == 'l' ||c == 'o' ||c == 'n') {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }
        }

        while(hashMap.getOrDefault('b', 0) >= 1 &&
                hashMap.getOrDefault('a', 0) >= 1 &&
                hashMap.getOrDefault('l', 0) >= 2 &&
        hashMap.getOrDefault('o', 0) >= 2 &&
        hashMap.getOrDefault('n', 0) >= 1) {

            ballons++;
            hashMap.put('b', hashMap.get('b') - 1);
            hashMap.put('a', hashMap.get('a') - 1);
            hashMap.put('l', hashMap.get('l') - 2);
            hashMap.put('o', hashMap.get('o') - 2);
            hashMap.put('n', hashMap.get('n') - 1);
        }
        return ballons;
    }
}
