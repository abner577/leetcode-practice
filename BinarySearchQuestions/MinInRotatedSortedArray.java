package BinarySearchQuestions;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public static int findMinRotated(int[] array){
        int low = 0;
        int high = array.length -1;

        while(low < high){
            int middle = (high + low) /2;
            int middleVal = array[middle];

            if(middleVal > array[high]){
                low = middle +1;
            } else {
                high = middle;
            }
        }
        return array[low];
    }
}
