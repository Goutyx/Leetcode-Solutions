class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int v = rooms.size();
        boolean[] visited = new boolean[v];
        Queue <Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i: rooms.get(temp)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }

        for(boolean b : visited){
            if(b==false) return false;
        }
        return true;
    }
}