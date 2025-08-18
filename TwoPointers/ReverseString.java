package TwoPointers;

public class ReverseString {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] strings){
        int left =0;
        int right = strings.length -1;

        while(left < right){
            char temp = strings[left];
            strings[left] = strings[right];
            strings[right] = temp;
            right--;
            left++;
        }
    }
}
