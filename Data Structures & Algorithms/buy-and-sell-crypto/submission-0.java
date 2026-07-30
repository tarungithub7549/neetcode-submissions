// class Solution {
//     public int maxProfit(int[] prices) {
//         int b = 0;
//         int s = 1;
//         int maxprofit = 0;
//         while(s < prices.length){
//             int profit = prices[s] - prices[b];
//             if(profit >= maxprofit){
//                 maxprofit = prices[s] - prices[b];
//             }
//             s++;
//             if(profit < maxprofit){
//                 b++;
//             }
//         }
//         return maxprofit;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];   // minimum price so far
        int profit = 0;        // max profit so far

        for (int i = 1; i < prices.length; i++) {

            // found cheaper buying price
            if (prices[i] < buy) {
                buy = prices[i];
            } 
            // sell today and update max profit
            else {
                profit = Math.max(profit, prices[i] - buy);
            }
        }

        return profit;
    }
}
