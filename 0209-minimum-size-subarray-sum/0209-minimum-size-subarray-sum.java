class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int max = Integer.MAX_VALUE;
        int count = 0;
        int k = 0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            count++;
            while(sum>=target){
                max = Math.min(max, count);
                sum = sum - nums[k];
                k++;
                count--;
            }
        }
        if(max == Integer.MAX_VALUE){
            return 0;
        }
        return max;
    }
}