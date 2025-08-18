package Review.ArraysStrings.prac;

public class BuySellPrac {
    public static void main(String[] args) {

    }
    public int buySell(int[] prices){
        int MIN_PRICE = Integer.MAX_VALUE;
        int MAX_PROFIT = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < MIN_PRICE) MIN_PRICE = prices[i];
            int profit = prices[i] - MIN_PRICE;

            if(profit > MAX_PROFIT){
                MAX_PROFIT = profit;
            }
        }
        return MAX_PROFIT;
    }
}
