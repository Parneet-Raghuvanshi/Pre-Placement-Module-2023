class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE, total_p = 0, p_today = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < low){
                low = prices[i];
            }
            p_today = prices[i] - low;
            if(total_p < p_today){
                total_p = p_today;
            }
        }
        return total_p;
    }
}