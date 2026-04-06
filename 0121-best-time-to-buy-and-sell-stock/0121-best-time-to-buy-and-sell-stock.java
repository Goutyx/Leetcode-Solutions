class Solution {
    public int maxProfit(int[] arr) {
        int minStock = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<arr.length;i++){
            if(minStock>arr[i]){
                minStock = arr[i];
            }
            int profit = arr[i]-minStock;
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}