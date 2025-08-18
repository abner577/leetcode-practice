package Review.ArraysStrings.prac;

import java.util.HashMap;

public class RomanToIntPrac {
    public static void main(String[] args) {

    }
    public int romanToInt(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int sum = 0;

        for (int i =0; i < s.length(); i++){
            if(i < s.length() -1 && hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i +1))){
                sum += hashMap.get(s.charAt(i + 1))  - hashMap.get(s.charAt(i));
                i++;
            }
            else sum += hashMap.get(s.charAt(i));
        }
        return sum;
    }
}
