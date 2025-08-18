package Review.ArraysStrings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public String longestCommonPre(String[] strs){
        if(strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length -1];
        int i =0;

        while(i < firstString.length() && i < lastString.length()
        && firstString.charAt(i) == lastString.charAt(i)){
            i++;
        }
        return firstString.substring(0, i);
    }
}
