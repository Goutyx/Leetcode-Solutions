class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[count] = nums[i-1];
                count++;
            }
        }
        nums[count] = nums[nums.length-1]; 
        return count+1;
    }
}
