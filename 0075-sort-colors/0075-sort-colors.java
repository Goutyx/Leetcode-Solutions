class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
        // Dutch National Flag Algorithm //
    //     int start=0;
    //     int current=0;
    //     int end=nums.length-1;

    //     while(current<=end){
    //         if(nums[current]==0){
    //             swap(nums, current, start);
    //             current++;
    //             start++;
    //         }else if(nums[current]==2){
    //             swap(nums, current, end);
    //             end--;
    //         }else{
    //             current++;
    //         }
    //     }
    // }

    // public void swap(int[] nums, int i, int j){
    //     int temp=nums[i];
    //     nums[i]=nums[j];
    //     nums[j]=temp;
    // }
