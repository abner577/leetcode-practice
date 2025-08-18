package HashMapsAndSets;

import java.util.HashSet;

public class JewelsStonesPrac {
    public static void main(String[] args) {

    }
    public static int jewelsStones(String jewels, String stones){
        HashSet<Character> set = new HashSet<>();
        int count =0;

        for(int i =0; i < jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        for(int i =0; i < stones.length(); i++){
            if(set.contains(stones.charAt(i))) count ++;
        }
        return count;
    }
}
