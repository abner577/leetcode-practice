package DynamicProgramming.prac;

public class JumpGamePrac2 {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int target = n -1;

        for(int i = n-1; i >= 0; i--) {

            if(nums[i] + i >= target) {
                target = i;
            }

        }
        return target == 0;
    }
}
