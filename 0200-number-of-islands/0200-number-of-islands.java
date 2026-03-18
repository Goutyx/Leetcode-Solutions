class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] visited = new boolean[r][c];
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(int r, int c, char[][] grid, boolean[][] visited){
        int rows = grid.length;
        int cols = grid[0].length;
        visited[r][c]=true;
        
        if(r-1>=0 && !visited[r-1][c] && grid[r-1][c]=='1'){
            dfs(r-1,c,grid,visited);
        }
        if(c-1>=0 && !visited[r][c-1] && grid[r][c-1]=='1'){
            dfs(r,c-1,grid,visited);
        }
        if(r+1<rows && !visited[r+1][c] && grid[r+1][c]=='1'){
            dfs(r+1,c,grid,visited);
        }
        if(c+1<cols && !visited[r][c+1] && grid[r][c+1]=='1'){
            dfs(r,c+1,grid,visited);
        }
    }
}