class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }

        int count = 0;
        int freq = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                count++;
                freq = Math.max(freq, count);
            }else{
                count = 0;
            }
        }
        return freq;
    }
}