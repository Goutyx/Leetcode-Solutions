class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0] - b[0]
        );

        for(int key : map.keySet()){
            pq.add(new int[]{map.get(key), key});

            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] arr = new int[k];
        int i = 0;

        while(!pq.isEmpty()){
            arr[i++] = pq.poll()[1];
        }

        return arr;
    }
}