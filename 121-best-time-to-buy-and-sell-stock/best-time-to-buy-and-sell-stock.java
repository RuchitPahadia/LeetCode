class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int curr = prices[i];
            if (curr < buy) {
                buy = curr;
            }
            res = Math.max(res, prices[i] - buy);
        }
        return res;
    }
}