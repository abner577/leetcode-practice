package Review.TwoPointers.prac;

public class SquaresSortedPrac {
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] array){
        int left = 0;
        int right = array.length -1;
        int index = array.length -1;
        int[] result = new int[array.length];

        while(left <= right){
            int leftSquared = array[left] * array[left];
            int rightSquared = array[right] * array[right];

            if(rightSquared > leftSquared){
                result[index] = rightSquared;
                right--;
            } else {
                result[index] = leftSquared;
                left++;
            }
            index--;
        }
        return result;
    }
}
