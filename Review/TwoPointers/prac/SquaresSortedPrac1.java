package Review.TwoPointers.prac;

public class SquaresSortedPrac1 {
    public static void main(String[] args) {

    }
    public int[] squares(int[] nums){
        int left = 0;
        int right = nums.length -1;
        int index = nums.length -1;
        int[] result = new int[nums.length];


        while(left < right){
            int leftSquared = nums[left] * nums[left];
            int rightSquared = nums[right] * nums[right];

            if(rightSquared > leftSquared) {
                result[index] = rightSquared;
                right--;
            } else {
                result[index] =  leftSquared;
                left++;
            }
            index--;
        }
        return result;
    }

}
