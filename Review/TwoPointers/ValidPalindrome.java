package Review.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s){
        if(s.equals("")) return true;
        int left = 0;
        int right = s.length() -1;
        s = s.toLowerCase();

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}
