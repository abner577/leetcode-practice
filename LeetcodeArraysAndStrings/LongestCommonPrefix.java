package LeetcodeArraysAndStrings;
import java.util.Arrays;
public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public static String LongestCommonPrefix1(String[] strings){

        if(strings == null || strings.length == 0) return "";
        Arrays.sort(strings);

        String firstString = strings[0];
        String lastString = strings[strings.length -1];
        int i =0;

        while(i < firstString.length() && i < lastString.length() && firstString.charAt(i) == lastString.charAt(i)){
            i++;
        }
        return firstString.substring(0,i);
    }

}
