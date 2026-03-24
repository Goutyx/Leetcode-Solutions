class Solution {
    class Pair{
        int node;
        int time;
        Pair(int node, int time){
            this.node = node;
            this.time = time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int src) {
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int a = times[i][0];
            int b = times[i][1];
            int c = times[i][2];
            list.get(a).add(new Pair(b, c));
        }
        int[] arr = new int[n+1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[src] = 0;
        PriorityQueue <Pair> pq = new PriorityQueue<>((a, b) -> a.time - b.time);
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            for(Pair p : list.get(temp.node)){
                int totalTime = temp.time + p.time;
                if(totalTime < arr[p.node]){
                    arr[p.node] = totalTime;
                    pq.add(new Pair(p.node, totalTime));
                }
            }
        }
        int max = 0;
        for(int i=1;i<n+1;i++){
            if(arr[i]==Integer.MAX_VALUE){
                return -1;
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}