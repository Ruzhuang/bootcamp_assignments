class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex=0;
        int profit=0;
        int share=0;
        for (int i=0;i<prices.length;i++){
            if(i+1<prices.length&&prices[i]<prices[i+1]&&share==0){
                share=1;
                buyIndex=i;
            }
            if((i+1==prices.length||prices[i]>prices[i+1])&&share==1){
                share=0;
                profit=profit+(prices[i]-prices[buyIndex]);
            }
        }
        return profit;
        
    }
}
