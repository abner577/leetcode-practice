package Review.BinarySearch.prac;

public class BinarySearchPrac {
    public static void main(String[] args) {

    }
    public int binarySearchPrac(int[] array, int target){
        int left = 0;
        int right = array.length -1;

        while(left <= right) {
            int middle = (left + right) / 2;
            int middleVal = array[middle];

            if(middleVal > target) right = middle - 1;
            else if (middleVal < target) left = middle + 1;
            else return middle;
        }
        return -1;
    }
}
