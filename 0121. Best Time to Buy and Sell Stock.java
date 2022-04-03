/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
class Solution {
    public int maxProfit(int[] prices) {
        int i,j = 0,max = 0;
        for(i = 1;i < prices.length;i++)
        {
            if(prices[j] < prices[i])
                max = Math.max(max,prices[i]-prices[j]);
            else
                j = i;
        }
        return max;
    }
}