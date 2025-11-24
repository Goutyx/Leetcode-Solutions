class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            map.put(nums[i], map.get(nums[i])+1);
        }

        int max=0;
        int min=0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                min=e.getKey();
            }
        }
        return min;
    }
}