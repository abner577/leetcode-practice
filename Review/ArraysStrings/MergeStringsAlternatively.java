package Review.ArraysStrings;

public class MergeStringsAlternatively {
    public static void main(String[] args) {

    }
    public String mergeAlternately(String word1, String word2) {
       StringBuilder mergedString =  new StringBuilder();
        int i =0;
        int j = 0;

        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()) mergedString.append(word1.charAt(i));
            if(j < word2.length()) mergedString.append(word2.charAt(j));
            i++;
            j++;
        }
        return mergedString.toString();
    }
}
