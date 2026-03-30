class Solution {
    public void rotate(int[] nums, int k) {
        int count = 0;
        int[] copy = nums.clone();
        k = k % nums.length;
        int len = nums.length-k;
        
        for(int i=len;i<nums.length;i++){
            nums[count] = copy[i];
            count++;
        }

        for(int i=0;i<len;i++){
            nums[count++] = copy[i];
        }
    }
}