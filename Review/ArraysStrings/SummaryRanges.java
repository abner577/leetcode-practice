package Review.ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {

    }
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i =0;

        while(i < nums.length){
            int startingPoint = nums[i];

            while(i < nums.length - 1 && nums[i +1] == nums[i] + 1){
                i++;
            }
            if(startingPoint != nums[i]){
                result.add(startingPoint + "->" + nums[i]);
            }
            else result.add(String.valueOf(nums[i]));
            i++;
        }
        return result;
    }
    public List<String> summaryRanges1(int[] array) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i =0;

        while(i < array.length){
            int startingPoint = array[i];
            while(i < array.length -1 && array[i] + 1 == array[i+1]){
                i++;
            }
            if (startingPoint != array[i]){
                arrayList.add(startingPoint + "->" + array[i]);
            } else {
                arrayList.add(String.valueOf(array[i]));
            }
            i++;
        }
        return arrayList;
    }
}
