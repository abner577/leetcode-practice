package HashMapsAndSets;

import java.util.HashMap;

public class ValidAnagramPrac {
    public static void main(String[] args) {

    }
    public static boolean validAnagram(String s, String t){
        if(t.length() != s.length()) return false;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for(int i =0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!hashMap.containsKey(c)) return false;
             else hashMap.put(c, hashMap.get(c) -1);

             if(hashMap.get(c) == 0) hashMap.remove(c);
        }
        return hashMap.isEmpty();
    }
}
