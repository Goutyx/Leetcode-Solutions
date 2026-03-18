class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int v = rooms.size();
        boolean[] visited = new boolean[v];
        dfs(0, visited, rooms);

        for(boolean b : visited){
            if(b==false) return false;
        }
        return true;
    }

    public static void dfs(int i, boolean[] visited, List<List<Integer>> rooms){
        visited[i] = true;
        for(int j : rooms.get(i)){
            if(!visited[j]){
                dfs(j, visited, rooms);
            }
        }
    }
}