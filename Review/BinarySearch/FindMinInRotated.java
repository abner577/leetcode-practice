package Review.BinarySearch;

public class FindMinInRotated {
    public static void main(String[] args) {

    }
    public int findMin(int[] array) {
        int left = 0;
        int right = array.length -1;

        while(left < right){
            int middle = (right + left) /2;
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
