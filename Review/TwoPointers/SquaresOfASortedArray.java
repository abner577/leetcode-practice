package Review.TwoPointers;

public class SquaresOfASortedArray {
    public static void main(String[] args) {

    }
    public int[] sortedSquared(int[] array){
        int[] result = new int[array.length];
        int left = 0;
        int right = array.length -1;
        int index = array.length -1;

        while(left <= right){
            int leftSquared = array[left] * array[left];
            int rightSquared = array[right] * array[right];

            if(rightSquared > leftSquared){
                result[index] = rightSquared;
                right--;
            } else {
                result[index] = rightSquared;
                left++;
            }
            index--;
        }
        return result;
    }
}
