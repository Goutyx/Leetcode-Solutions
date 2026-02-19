class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int price = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int profit = prices[i] - min;
            price = Math.max(price, profit);
        }
        return price;
    }
}