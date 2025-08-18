package BinarySearchQuestions;

public class SearchInsertPosition1 {
    public static void main(String[] args) {

    }
    public static int SIP(int[] array, int target){
        int low = 0;
        int high = array.length -1;

        while(low <= high){
            int mid = (high + low)/ 2;
            int midVal = array[mid];

            if(target > midVal){
                low = mid +1;
            } else if (target < midVal) {
                high = mid -1;
            } else {
                return mid;
            }
        }
        return low;
    }
}
