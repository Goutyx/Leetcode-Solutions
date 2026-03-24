class Solution {
    class Pair{
        int node;
        double prob;
        Pair(int node, double prob){
            this.node = node;
            this.prob = prob;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succ, int start, int end) {
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            double c = succ[i];
            list.get(a).add(new Pair(b, c));
            list.get(b).add(new Pair(a, c));
        }
        PriorityQueue <Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        double[] arr = new double[n];
        arr[start] = 1;
        pq.add(new Pair(start, 1));

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            for(Pair i : list.get(curr.node)){
                double totalProb = curr.prob * i.prob;
                if(totalProb> arr[i.node]){
                    arr[i.node] = totalProb;
                    pq.add(new Pair(i.node, totalProb));
                }
            }
        }
        return arr[end];
    }
}