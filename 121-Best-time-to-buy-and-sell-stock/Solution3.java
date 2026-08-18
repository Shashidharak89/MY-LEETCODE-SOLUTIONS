class Solution {
    public int maxProfit(int[] prices) {
        int bestbuy = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - bestbuy);
            if (prices[i] < bestbuy) {
                bestbuy = prices[i];
            }
        }
        return max;
    }
}