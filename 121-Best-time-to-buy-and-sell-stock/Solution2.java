class Solution {
    public int maxProfit(int[] prices) {
        int bestbuy=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            int current=prices[i];
            if(current <bestbuy){
                bestbuy=current;
            }
            else{
                maxprofit=Math.max(maxprofit,current-bestbuy);
            }
        }
        return maxprofit;
    }
}