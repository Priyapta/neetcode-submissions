class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ; 
    
        for (int i = 0 ; i < prices.length-1; i++){

            int current = prices[i];
            for (int j = i+1 ; j < prices.length;j++){
                if( prices[j] - current > profit){
                    profit = prices[j] - current  ;
                }
               
            }
        }
        return profit;
    }
}
