class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long curr = 0;
        int left = 0;

        for(int i=0;i<nums.length;i++){
            curr = curr + nums[i];
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);

            if(i-left+1>k){
                curr = curr - nums[left];
                int a = map.get(nums[left]);
                map.put(nums[left], a-1);

                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }

            if((i-left+1)==k && map.size()==k){
                sum = Math.max(sum, curr);
            }
        }
        return sum;
    }
}