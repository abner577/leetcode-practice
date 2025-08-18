package Review.ArraysStrings.prac;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesPrac1 {
    public static void main(String[] args) {

    }
    public List<String> summaryRanges1(int[] nums){
        List<String> list = new ArrayList<>();
        int i =0;

        while(i < nums.length){
            int startingpoint = nums[i];
            while(i < nums.length -1 && nums[i + 1] == nums[i] + 1) i++;

            if(startingpoint != nums[i]) list.add(startingpoint + "->" + nums[i]);
            else list.add(String.valueOf(nums[i]));
            i++;
        }
        return list;
    }
}
