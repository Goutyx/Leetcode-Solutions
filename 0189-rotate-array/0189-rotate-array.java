class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // fix
        
        int count = 0;
        int[] copy = nums.clone();

        int len = n - k;

        for(int i = len; i < n; i++){
            nums[count++] = copy[i];
        }

        for(int i = 0; i < len; i++){
            nums[count++] = copy[i];
        }
    }
}