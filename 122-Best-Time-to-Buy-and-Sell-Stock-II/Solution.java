class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        if(prices.length==1){
            return 0;
        }
        int i=0,j=1;
        while(j<prices.length){
            if(prices[i]<prices[j]){
                profit+=prices[j]-prices[i];
            }
            i++;
            j++;
        }
        return profit;
    }
}