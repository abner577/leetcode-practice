package SlidingWindow.prac;

public class MaxConsecutiveOnesPrac {
    public static void main(String[] args) {

    }
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int numOfZeroes = 0;
        int distance = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[right] == 0) numOfZeroes++;

            while(numOfZeroes > k){
                if(nums[left] == 0) numOfZeroes--;
                left++;
            }

            int longest = (right - left) + 1;
            distance = Math.max(longest, distance);
            right++;
        }
        return distance;
    }
}
