package Review.BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] array, int target){
        int low = 0;
        int high = array.length -1;

        while(low <= high){
            int middle = (high + low) / 2;
            int middleVal = array[middle];

            if(middleVal > target) high = middle -1;
            else if (middleVal < target) low = middle +1;
            else return middle;
        }
        return low;
    }
}
