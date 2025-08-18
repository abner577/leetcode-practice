package BinarySearchQuestions;

public class BsEARCH {
    public static void main(String[] args) {

    }
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length -1;

        while(low < high){
            int middle = (high + low) / 2;
            int middleVal = array[middle];

            if(target > middleVal){
                low = middle +1;
            } else if (target < middleVal) {
                high = middle -1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
