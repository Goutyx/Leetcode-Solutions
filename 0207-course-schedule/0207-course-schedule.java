class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            list.get(a).add(b);
        }
        int[] indegree = new int[n];
        for(int i=0;i<n;i++){
            for(int j:list.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();

        while(!q.isEmpty()){
            int temp = q.poll();
            result.add(temp);
            for(int j:list.get(temp)){
                indegree[j]--;
                if(indegree[j]==0){
                    q.add(j);
                }
            }
        }
        if(result.size()!=n){
            return false;
        }else{
            return true;
        }
    }
}