package SlidingWindow;

public class MinSizeSubarraySum {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int shortest = Integer.MAX_VALUE;
        int length = 0;

        for(int right =0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                length = right - left + 1;
                shortest = Math.min(length, shortest);
                sum -= nums[left];
                left++;
            }
        }
        if(shortest == Integer.MAX_VALUE) return 0;
        else return shortest;
    }
}

