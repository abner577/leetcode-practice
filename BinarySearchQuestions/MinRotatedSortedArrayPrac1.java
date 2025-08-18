package BinarySearchQuestions;

public class MinRotatedSortedArrayPrac1 {
    public static void main(String[] args) {

    }
    public static int minInSorted(int[] array){
        int left = 0;
        int right = array.length -1;

        while(left < right){
            int middle = (left + right) /2;
            int middleVal = array[middle];

            if(middleVal > array[right]){
                left = middle +1;
            } else {
                right = middle;
            }
        }
        return array[left];
    }
}
