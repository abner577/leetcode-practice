package SlidingWindow.prac;

public class MinSizeSubarrayPrac1 {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int smallest = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                int windowSize = right -left + 1;
                smallest = Math.min(smallest, windowSize);
                sum -= nums[left];
                left++;
            }
        }
        if(smallest == Integer.MAX_VALUE) return 0;
        else return smallest;
    }
}
