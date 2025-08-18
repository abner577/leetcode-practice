package Review.ArraysStrings.prac;

public class MergeStringsAltPrac {
    public static void main(String[] args) {

    }
    public String mergeStrings(String word1, String word2){
        StringBuilder stringBuilder = new StringBuilder();
        int i =0;
        int j =0;

        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()) stringBuilder.append(word1.charAt(i));
            if(j < word2.length()) stringBuilder.append(word2.charAt(j));
            i++;
            j++;
        }
        return stringBuilder.toString();
    }
}
