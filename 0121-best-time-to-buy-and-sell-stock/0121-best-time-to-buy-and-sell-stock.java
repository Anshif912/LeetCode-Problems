class Solution {
    public int maxProfit(int[] prices) {

        int mini=Integer.MAX_VALUE;
        int profit=0;

        for(int i=0;i<prices.length;i++){
            mini=Math.min(mini,prices[i]);
            int pro=prices[i]-mini;

            profit=Math.max(profit,pro);
        }

        return profit;


        
    }
}