package Review.ArraysStrings;

public class IsSubsequence {
    public static void main(String[] args) {

    }
    public static boolean isSubsequence(String s, String t){
        if(s.length() > t.length()) return false;
        if(s.isEmpty()) return true;
        int i =0;
        int j =0;

        while(i < t.length() && j < s.length()){
            if(t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == s.length();
    }
}
