class Solution {
    public int[] searchRange(int[] nums, int target) {
        int one= searchFirst(nums, target);
        int two= searchLast(nums, target);
        return new int[]{one, two};
    }

    public int searchFirst(int[] nums, int target){
        int first=0;
        int last=nums.length-1;
        int ans=-1;

        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]==target){
                ans=mid;
                last=mid-1;
            }else if(nums[mid]<target){
                first=mid+1;
            }else{
                last=mid-1;
            }
        }
        return ans;
    }

    public int searchLast(int[] nums, int target){
        int first=0;
        int last=nums.length-1;
        int ans=-1;

        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]==target){
                ans=mid;
                first=mid+1;
            }else if(nums[mid]<target){
                first=mid+1;
            }else{
                last=mid-1;
            }
        }
        return ans;
    }
}