import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int bestbuy=prices[0],profit=0;

        for(int i=0;i<prices.length;i++){

            if(prices[i]<bestbuy){

                bestbuy=prices[i];
            }

            profit=Math.max(profit,prices[i]-bestbuy);

        }

        return profit;
    }
}