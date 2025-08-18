package Review.TwoPointers;

public class ReverseString {
    public static void main(String[] args) {

    }
    public void reverseString(char[] strings){
        int left = 0;
        int right = strings.length -1;
        char temp;

        while(left < right){
            temp = strings[left];
            strings[left] = strings[right];
            strings[right] = temp;

            left++;
            right--;
        }
    }
}
