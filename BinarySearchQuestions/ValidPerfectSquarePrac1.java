package BinarySearchQuestions;

public class ValidPerfectSquarePrac1 {
    public static boolean perfectSquared(int num){
        long left =1;
        long right = num;

        while(left <= right){
            long middle = (left + right) /2;
            long middleSquared = middle * middle;

            if(middleSquared > num){
                right = middle -1;
            } else if (middleSquared < num) {
                left = middle +1;
            } else {
                return true;
            }
        }
        return false;
    }
}
