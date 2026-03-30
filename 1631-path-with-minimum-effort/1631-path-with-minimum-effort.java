class Solution {
    class Pair {
        int row;
        int col;
        int efforts;

        Pair(int row, int col, int efforts){
            this.row = row;
            this.col = col;
            this.efforts = efforts;
        }
    }

    public int minimumEffortPath(int[][] arr) {
        int r = arr.length;
        int cc = arr[0].length;
        PriorityQueue <Pair> q = new PriorityQueue<>((a,b) -> a.efforts - b.efforts);
        int[][] ans = new int[r][cc];
        for(int i=0;i<r;i++){
            for(int j=0;j<cc;j++){
                ans[i][j] = Integer.MAX_VALUE;
            }
        }
        ans[0][0] = 0;
        q.add(new Pair(0,0,0));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int a = curr.row;
            int b = curr.col;
            int c = curr.efforts;


            // if(a==r-1 && b==cc-1){
            //     continue;
            // }
            if(a>0){
                int e = Math.abs(arr[a][b] - arr[a-1][b]);
                e = Math.max(e,c);
                if(e < ans[a-1][b]){
                    ans[a-1][b] = e;
                    q.add(new Pair(a-1,b,e));
                }
            }
            
            if(b>0){
                int e = Math.abs(arr[a][b] - arr[a][b-1]);
                e = Math.max(e,c);
                if(e < ans[a][b-1]){
                    ans[a][b-1] = e;
                    q.add(new Pair(a,b-1,e));
                }
            }
            
            if(a<r-1){
                int e = Math.abs(arr[a][b] - arr[a+1][b]);
                e = Math.max(e,c);
                if(e < ans[a+1][b]){
                    ans[a+1][b] = e;
                    q.add(new Pair(a+1,b,e));
                }
            }
            
            if(b<cc-1){
                int e = Math.abs(arr[a][b] - arr[a][b+1]);
                e = Math.max(e,c);
                if(e < ans[a][b+1]){
                    ans[a][b+1] = e;
                    q.add(new Pair(a,b+1,e));
                }
            }
        }
        return ans[r-1][cc-1];
    }
}