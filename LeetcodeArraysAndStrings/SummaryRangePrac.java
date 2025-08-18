package LeetcodeArraysAndStrings;

import java.util.ArrayList;

public class SummaryRangePrac {
    public static void main(String[] args) {

    }
    public static ArrayList<String> SummaryRanges(int[] array){
        ArrayList<String> arrayList = new ArrayList<>();
        int i =0;

        while(i < array.length){
            int startingPoint = array[i];
            if(i < array.length -1 && array[i+1] == array[i] + 1){
                i++;
            }

            if(startingPoint != array[i]){
                arrayList.add(startingPoint + "->" + array[i]);
            } else {
                arrayList.add(String.valueOf(array[i]));
            }
            i++;
        }
        return arrayList;
    }
}
