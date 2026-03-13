class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        int count = 0;
        while(!pq.isEmpty()){
            if(count==nums.length-k){
                return pq.peek();
            }else{
                count++;
                pq.poll();
            }
        }
        return 0;
    }
}