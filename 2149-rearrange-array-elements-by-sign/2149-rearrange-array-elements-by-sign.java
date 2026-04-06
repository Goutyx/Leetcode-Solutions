class Solution {
    public int[] rearrangeArray(int[] nums) {
        int odd = 0;
        int even = 1;
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr[odd] = nums[i];
                if(odd+2<nums.length){
                    odd = odd+2;
                }
            }else{
                arr[even] = nums[i];
                if(even+2<nums.length){
                    even = even+2;
                }
            }
        }
        return arr;
    }
}