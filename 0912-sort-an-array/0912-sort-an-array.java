class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        int j = 0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(!pq.isEmpty()){
            arr[j++] = pq.poll();
        }
        return arr;
    }
}