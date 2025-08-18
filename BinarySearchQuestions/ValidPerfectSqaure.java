package BinarySearchQuestions;

public class ValidPerfectSqaure {
    public static void main(String[] args) {

    }
    public static boolean validPerfectSqaure(int num){
        int low = 1;
        int high = num;

        while(low <= high){
            int middle = (high + low) /2;

            if(middle * middle == num){
                return true;
            } else if (middle * middle < num) {
                low = middle +1;
            } else{
                high = middle -1;
            }
        }
        return false;
    }
}
