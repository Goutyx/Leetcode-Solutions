class Solution {
    public int[] findOrder(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] result = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int j=0;j<edge.length;j++){
            int a = edge[j][0];
            int b = edge[j][1];
            list.get(b).add(a);
        }
        int[] degree = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int m:list.get(i)){
                degree[m]++;
            }
        }
        for(int i=0;i<n;i++){
            if(degree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int temp = q.poll();
            result[count++] = temp;
            for(int j:list.get(temp)){
                degree[j]--;
                if(degree[j]==0){
                    q.add(j);
                }
            }
        }
        if(count!=n){
            return new int[0];
        }
        return result;
    }
}