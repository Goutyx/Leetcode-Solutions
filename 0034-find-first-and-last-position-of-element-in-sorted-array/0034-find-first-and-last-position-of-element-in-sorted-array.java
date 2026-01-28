class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = searchFirst(nums, target);
        int last = searchLast(nums, target);
        return new int[]{first, last};
    }

    public int searchFirst(int[] nums, int target){
        int value = -1;
        int f = 0;
        int l = nums.length-1;
        while(f<=l){
            int mid = (f+l)/2;
            if(nums[mid]==target){
                value = mid;
                l = mid-1;
            }
            if(nums[mid]<target){
                f = mid+1;
            }
            if(nums[mid]>target){
                l = mid-1;
            }
        }
        return value;
    }
    public int searchLast(int[] nums, int target){
        int value = -1;
        int f = 0;
        int l = nums.length-1;
        while(f<=l){
            int mid = (f+l)/2;
            if(nums[mid]==target){
                value = mid;
                f = mid+1;
            }
            if(nums[mid]<target){
                f = mid+1;
            }
            if(nums[mid]>target){
                l = mid-1;
            }
        }
        return value;
    }
}