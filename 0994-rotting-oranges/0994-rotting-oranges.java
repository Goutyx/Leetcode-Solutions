class Solution {
    public int orangesRotting(int[][] grid) {
        Queue <int[]> queue = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int minutes = 0;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        while(!queue.isEmpty() && fresh>0){
            int size = queue.size();

            for(int i=0;i<size;i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] arr : dir){
                    int newR = r + arr[0];
                    int newC = c + arr[1];

                    if(newR>=0 && newR<m && newC>=0 && newC<n && grid[newR][newC]==1){
                        grid[newR][newC]=2;
                        fresh--;
                        queue.add(new int[]{newR,newC});
                    }
                }
            }
            minutes++;
        }
        if(fresh==0){
            return minutes;
        }else{
            return -1;
        }
    }
}