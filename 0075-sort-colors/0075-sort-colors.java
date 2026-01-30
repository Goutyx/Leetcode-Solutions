class Solution {
    public void sortColors(int[] nums) {
    // Dutch National Flag Algorithm is used when sorting is involved and only three numbers 0 1 and 2 is involved //
        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid<=end){
            if(nums[mid]==0){
                swap(nums, start, mid);
                start++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, end, mid);
                end--;
            }
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
        
