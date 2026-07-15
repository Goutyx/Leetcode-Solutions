class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;

        int lm = 0;
        int rm = 0;
        int sum = 0;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=lm){
                    lm = height[left];
                }else{
                    sum = sum + (lm - height[left]);
                }
                left++;
            }else{
                if(height[right]>=rm){
                    rm = height[right];
                }else{
                    sum = sum + (rm - height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}