package TwoPointers;

public class ReverseStringPrac1 {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] s){
        int left =0;
        int right = s.length -1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
    }
}
