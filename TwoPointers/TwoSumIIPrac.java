package TwoPointers;

public class TwoSumIIPrac {
    public static void main(String[] args) {

    }
    public static int[] twoSumII(int[] array, int target){
        int left = 0;
        int right = array.length -1;

        while(left <= right){
            int sum = array[left] + array[right];
            if(sum > target){
                right--;
            } else if (sum < target){
                left++;
            } else{
                return new int[] {left +1, right +1};
            }
        }
        return array;
    }
}
