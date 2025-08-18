package Review.ArraysStrings.prac;

public class SubsequencePrac {
    public static void main(String[] args) {

    }
    public boolean isSub(String s, String t){
        if(s.length() > t.length()) return false;
        if(t.equals(s)) return true;
        int i =0;
        int j = 0;

        while(i < s.length() || j < t.length()){
            if(t.charAt(j) == s.charAt(i)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
