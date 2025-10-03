package DynamicProgramming;

public class JumpGame {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int target = n-1;

        for(int i =n-1; i >= 0; i--) {
            int maxJump = nums[i];
            if(i + maxJump >= target) target = i;
        }
        return (target == 0);
    }
}
