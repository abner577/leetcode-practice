package TwoPointers;

public class SquaresOfASortedArray {
    public static void main(String[] args) {

    }
    public static int[] squared(int[] array){
        int[] result = new int[array.length];

        int left = 0;
        int right = array.length -1;
        int index = array.length -1;

        while(left <= right){
            int leftSqaured = array[left] * array[left];
            int rightSqaured = array[right] * array[right];

            if(leftSqaured < rightSqaured){
                result[index] = leftSqaured;
                left++;
            } else {
                result[index] = rightSqaured;
                right--;
            }
            index--;
        }
        return result;
    }
}
