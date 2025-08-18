package Review.TwoPointers.prac;

public class ValidPalindromePrac {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() -1;
        if(s.equals("")) return true;
        s = s.toLowerCase();

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
