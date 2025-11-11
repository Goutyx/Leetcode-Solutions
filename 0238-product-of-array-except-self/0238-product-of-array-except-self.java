class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int zero=0;
        int count=1;
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            if (nums[i]==0){
                zero++;
                continue;
            }
            count=count*nums[i];
        }

        for(int i=0;i<n;i++){
            if(zero>1){
                arr[i]=0;
            }else if(zero==1){
                if(nums[i]==0){
                    arr[i]=count;
                }else{
                    arr[i]=0;
                }
            }else{
                arr[i]=count/nums[i];
            }
        }
        return arr;
    }
}