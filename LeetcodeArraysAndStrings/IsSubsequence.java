package LeetcodeArraysAndStrings;

public class IsSubsequence {
    public static void main(String[] args) {

    }
    public static boolean subSequence(String subWord, String originalWord){
        int i =0, j =0;
        if(subWord.length() > originalWord.length()) return false;
        if(subWord.equals(originalWord)) return true;
        if(subWord.isEmpty()) return false;

        while(i < originalWord.length() && j < subWord.length()){
            if(originalWord.charAt(i) == subWord.charAt(j)){
                j++;
            }
            i++;
        }
        return j == subWord.length();
    }

}
