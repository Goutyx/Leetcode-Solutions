class Solution {
    boolean found = true;
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visit = new int[n];
        for(int i=0;i<n;i++){
            visit[i] = -1;
        }
        for(int i=0;i<n;i++){
            if(visit[i]==-1){
                bfs(i, visit, graph);
            }
        }
        return found;
    }
    public void bfs(int i, int[] visit, int[][] graph){
        visit[i] = 0;
        Queue <Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int temp  = q.poll();
            int color = visit[temp];
            for(int k : graph[temp]){
                if(visit[k]==visit[temp]){
                    found = false;
                    return;
                }
                if(visit[k]==-1){
                    visit[k] = 1-color;
                    q.add(k);
                }
            }
        }
    }
}