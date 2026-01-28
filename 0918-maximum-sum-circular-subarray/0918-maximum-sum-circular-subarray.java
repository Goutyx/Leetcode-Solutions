class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currentMax = 0;
        int currentMin = 0;
        int max = nums[0];
        int min = nums[0];

        for(int num : nums){
            currentMax = Math.max(num, currentMax+num);
            max = Math.max(currentMax,max);

            currentMin = Math.min(num, currentMin+num);
            min = Math.min(currentMin, min);

            totalSum = totalSum + num;
        }

        if(max<0){
            return max;
        }

        return Math.max(max, totalSum - min);
    }
}