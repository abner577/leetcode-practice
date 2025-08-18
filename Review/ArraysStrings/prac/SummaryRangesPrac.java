package Review.ArraysStrings.prac;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesPrac {
    public static void main(String[] args) {

    }
    public List<String> summaryRanges(int[] nums){
        List<String> result = new ArrayList<>();

        for(int i =0; i < nums.length; i++){
            int startingpoint = nums[i];

            while(i < nums.length -1 && nums[i +1] == nums[i] + 1){
                i++;
            }
            if(startingpoint != nums[i]) result.add(startingpoint + "->" + nums[i]);
            else result.add(String.valueOf(nums[i]));
        }
        return result;
    }
}
