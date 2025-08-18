package SlidingWindow.prac;

public class MaxAvgSubArratPrac {
    public static void main(String[] args) {

    }
    public static double maxAvg(int[] array, int k){
        int left = 0;
        int right =0;
        double currSum = 0;
        double maxAvg = 0;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        if(freq1 == freq2){

        }

        while(right < k){
            currSum += array[right];
            right++;
        }
        maxAvg = currSum / k;
        while(right < array.length){
            currSum -= array[left];
            currSum += array[right];
            right++;
            left++;

            double average = currSum / k;
            maxAvg = Math.max(average, maxAvg);
        }
        return maxAvg;
    }
}
