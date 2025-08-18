package SlidingWindow.prac;

public class MaxAbgSubarrayPrac {
    public static void main(String[] args) {

    }
    public double findMaxAverage(int[] array, int k) {
        double sum = 0;
        double average = 0;
        int left = 0;
        int right = 0;

        while(right < k){
            sum += array[right];
            right++;
        }
        average = sum / k;

        while(right < array.length){
            sum += array[right];
            sum -= array[left];
            left++;
            right ++;

            double curSum = sum / k;
            average = Math.max(average, curSum);
        }
        return average;
    }
}
