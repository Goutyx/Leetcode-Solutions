class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] visited = new boolean[r][c];
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    bfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }

    public static void bfs(int i, int j, char[][] grid, boolean[][] visited){
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int first = temp[0];
            int second = temp[1];

            if(first-1>=0 && !visited[first-1][second] && grid[first-1][second]=='1'){
                visited[first-1][second]=true;
                q.add(new int[]{first-1,second});
            }
            if(first+1<r && !visited[first+1][second] && grid[first+1][second]=='1'){
                visited[first+1][second]=true;
                q.add(new int[]{first+1,second});
            }
            if(second-1>=0 && !visited[first][second-1] && grid[first][second-1]=='1'){
                visited[first][second-1]=true;
                q.add(new int[]{first,second-1});
            }
            if(second+1<c && !visited[first][second+1] && grid[first][second+1]=='1'){
                visited[first][second+1]=true;
                q.add(new int[]{first,second+1});
            }
        }
    }
}