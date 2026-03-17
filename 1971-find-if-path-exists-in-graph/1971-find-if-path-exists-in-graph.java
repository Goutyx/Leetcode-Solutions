class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            ArrayList<Integer> result = new ArrayList<>();
            list.add(result);
        }
        for(int j=0;j<edges.length;j++){
            int a = edges[j][0];
            int b = edges[j][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        bfs(n, list, visited, source, destination);
        return visited[destination];
    }
    public static void bfs(int n,ArrayList<ArrayList<Integer>>list,boolean[] visited,int source,int destination){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;

        while(!q.isEmpty()){
            int temp = q.poll();
            for(int k : list.get(temp)){
                if(!visited[k]){
                    visited[k]=true;
                    q.add(k);
                }
            }
        }
    }
}