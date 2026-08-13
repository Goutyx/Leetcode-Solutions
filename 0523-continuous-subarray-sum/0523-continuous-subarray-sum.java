class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            prefixSum = prefixSum + nums[i];

            if(map.containsKey(prefixSum % k)){
                if(i - map.get(prefixSum % k)>=2){
                    return true;
                }
            }else{
                map.put(prefixSum % k, i);
            }
        }
        return false;
    }
}