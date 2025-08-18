package BinarySearchQuestions;

public class RotatedSortedArrayPrac {
    public static void main(String[] args) {

    }
    public static int sortedArray(int[] array){
        int left = 0;
        int right = array.length;

        while(left < right){
            int mid = (left + right) /2;
            int midVal = array[mid];

            if(midVal > array[right]){
                left = mid +1;
            } else if (midVal < array[right]){
                right = mid;
            }
        }
        return array[left];
    }
}
