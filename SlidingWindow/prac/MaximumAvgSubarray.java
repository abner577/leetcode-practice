package SlidingWindow.prac;

public class MaximumAvgSubarray {
    public static void main(String[] args) {

    }
    public double findMaxAverage(int[] array, int k) {
        double average = 0;
        int left = 0;
        int right = 0;
        double sum= 0;

        while(right < k){
            sum += array[right];
            right++;
        }
        average = sum / k;

        while (right < array.length){
            sum -= array[left];
            sum += array[right];
            right++;
            left++;

            double maxAvg = sum / k;
            average = Math.max(maxAvg, average);
        }
        return average;
    }
}
