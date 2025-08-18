package Review.HashMaps.prac;

import java.util.HashMap;

public class RansomNotePrac {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i =0; i < magazine.length(); i++){
           char c = magazine.charAt(i);
           hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for(int i =0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);

            if(!hashMap.containsKey(c) || hashMap.get(c) == 0) return false;
            else hashMap.put(c, hashMap.get(c) - 1);
        }
        return true;
    }
}
