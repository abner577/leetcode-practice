package Review.ArraysStrings.prac;

public class NumClosestToZeroPrac {
    public static void main(String[] args) {

    }
    public int closeestnumber(int[] nums){
        int smallest = nums[0];

        for(int i =0; i < nums.length; i++){
            if(Math.abs(nums[i]) < Math.abs(smallest)) {
                smallest = nums[i];
            }
        }
        for(int i =0; i < nums.length; i++){
            if(smallest < 0 && nums[i] == Math.abs(smallest)) return nums[i];
        }
        return smallest;
    }
}
