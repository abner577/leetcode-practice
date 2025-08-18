package TwoPointers;

public class ValidPalindromePrac1 {
    public static void main(String[] args) {

    }
    public static boolean validPalindrome(String s){
        int left =0;
        int right = s.length() -1;
        String lowercaseString = s.toLowerCase();

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(lowercaseString.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(lowercaseString.charAt(right))){
                right--;
            }
            if(lowercaseString.charAt(left) != lowercaseString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
