class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] arr = new int[nums.length];
        int j = arr.length-1;

        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                arr[j] = nums[left] * nums[left];
                j--;
                left++;
            }else{
                arr[j] = nums[right] * nums[right];
                j--;
                right--;
            }
        }
        return arr;
    }
}