package Review.ArraysStrings;

public class BestTimeToBuySell {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i < prices.length; i++){
            if(prices[i] < min) min = prices[i];

            int profit = prices[i] - min;
            if(profit > max){
                max = profit;
            }
        }
        return max;
    }
}
