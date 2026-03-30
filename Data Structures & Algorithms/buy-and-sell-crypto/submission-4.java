class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int sell : prices){
            if(sell < min){
                min = sell;
            } else {
                profit = Math.max(profit, sell-min);
            }
        }
        return profit;
    }
}
