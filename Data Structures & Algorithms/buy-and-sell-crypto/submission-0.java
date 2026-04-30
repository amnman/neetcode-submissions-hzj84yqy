class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=l+1,n=prices.length;
        int maxCost=0;
        while(r<n){
            if(prices[l]>prices[r]){
                l=r;
            }else{
                maxCost = Math.max(maxCost,prices[r]-prices[l]);
            }
            r++;
        }
        return maxCost;
    }
}
