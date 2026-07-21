class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum = 0;
        int left = 0;
        double max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(i-left+1==k){
                max = Math.max(sum, max);
                sum = sum - arr[left];
                left++;
            }
        }
        return max/k;
    }
}