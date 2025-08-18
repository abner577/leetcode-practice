package Review.HashMaps;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if(s.length() != t.length()) return false;

        for(int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for(int i =0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!hashMap.containsKey(c) || hashMap.get(c) == 0) return false;
            else hashMap.put(c, hashMap.get(c) - 1);
        }
        return true;
    }
}
