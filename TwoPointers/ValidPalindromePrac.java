package TwoPointers;

public class ValidPalindromePrac {
    public static void main(String[] args) {

    }
    public static boolean validPalindrome(String s){
        int left =0;
        int right = s.length() -1;
        String sLower = s.toLowerCase();

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(sLower.charAt(left) != sLower.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
