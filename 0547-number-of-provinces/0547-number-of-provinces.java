class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                bfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    public static void bfs(int i, int[][] isConnected, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[i] = true;
        q.add(i);

        while(!q.isEmpty()){
            int temp = q.poll();
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[temp][j]==1 && !visited[j]){
                    visited[j]=true;
                    q.add(j);
                }
            }
        }
    }
}