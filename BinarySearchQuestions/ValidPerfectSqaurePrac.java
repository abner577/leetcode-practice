package BinarySearchQuestions;

public class ValidPerfectSqaurePrac {
    public static void main(String[] args) {

    }
    public static boolean validPerfectSquared1(int num){
        long left = 1;
        long right = num;

        while(left <= right){
            long mid = (right + left) /2;
            long midSquared = mid * mid;

            if(midSquared > num){
                right = mid -1;
            } else if (midSquared < num) {
                left = mid +1;
            } else {
                return true;
            }
        }
        return false;
    }
}
