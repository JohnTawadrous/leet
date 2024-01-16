package dynamic;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices){

        //cannot be profit if there is less than 2 values
        if(prices == null || prices.length <= 1) return 0;

        //start with our first value
        int minPrice = prices[0];

        //variable that will hold the max profit value
        int diff = 0;

        //loop that will check the diff, starting at the 2nd value
        for(int i = 1 ; i < prices.length ; i++){

            //variables that will be compared to diff and minPrice
            int tempPrice = prices[i];
            int tempProfit = tempPrice - minPrice;

            //Math library to compare both values and assigning them
            diff = Math.max(diff, tempProfit);
            minPrice = Math.min(minPrice, tempPrice);

        }

        //diff will hold the max profit at the end of the loop
        return diff;
    }
}
