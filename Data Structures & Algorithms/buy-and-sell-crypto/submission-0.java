class Solution {
    public int maxProfit(int[] prices) {
        int L = 0;
        int R = 1;
        int maxPro = 0;

        while( R < prices.length ){
            if((prices[R] > prices[L])){
                maxPro = Math.max(maxPro, prices[R] - prices[L]);
            }
            else {
                L = R;
            }
            R++;

        }
        return maxPro;
        
    }
}
