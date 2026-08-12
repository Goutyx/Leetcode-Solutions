class Solution {
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int left = 0;
        int right = 0;

        if(sum-nums[0]==0){
            return 0;
        }

        for(int i=1;i<nums.length;i++){
            left = left + nums[i-1];
            right = sum-left-nums[i];

            if(left==right){
                return i;
            }
        }
        return -1;
    }
}