package Review.BinarySearch;

import java.lang.reflect.Type;

public class ValidPerfectSquare {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num){
        long left = 0;
        long right = num;

        while(left <= right) {
            long middle = (left + right) / 2;
            long middleVal = middle * middle;

            if(middleVal == num) return true;
            else if (middleVal > num) right = middle - 1;
            else left = middle + 1;
        }
        return false;
    }
}
