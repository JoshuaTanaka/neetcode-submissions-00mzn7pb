class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max = 0;
        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                int temp = prices[sell] - prices[buy];
                max = Math.max(temp, max);
                sell++;
            } else {
                buy = sell;
                sell ++;
            }
        }
        return max;
    }
}
