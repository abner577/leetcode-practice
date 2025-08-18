package LeetcodeArraysAndStrings;

import java.util.ArrayList;

public class SummaryRanges {
    public static void main(String[] args) {

    }
    public static ArrayList<String> summaryRanges(int[] array){
        ArrayList<String> arrayList = new ArrayList<>();
        int i =0;

        while(i < array.length){
            int startingPoint = array[i]; //our startingPoint is = to the number that we are currently looking at
            
//this makes sure that we are not going to look out of bounds, if we look at i+1 when i is == to length -1 we will get outofBounds
//then, we check that the value at i+1 is equal to the value of i + 1, if it is, we increment i
            while(i < array.length -1 && array[i] + 1 == array[i+1]){
                i++;
            } //after we get out of this while loop we HAVE hit a breaking point,


            if (startingPoint != array[i]){ //if our startingPoint isnt equal to array[i], this means that we found a valid range. Since we increment i by one if we find a valid range, array[i] will be differet, if it is still the same then this means that i++ never happened so we never found a valid range
                arrayList.add(startingPoint + "->" + array[i]);
            } else {
                arrayList.add(String.valueOf(array[i]));
            }
            i++;
        }
        return arrayList;
    }

}
