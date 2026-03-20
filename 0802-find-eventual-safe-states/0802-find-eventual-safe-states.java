class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j:graph[i]){
                list.get(j).add(i);
            }
        }
        int[] out = new int[n];
        for(int i=0;i<n;i++){
            out[i] = graph[i].length;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(out[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int temp = q.poll();
            result.add(temp);
            for(int ele:list.get(temp)){
                out[ele]--;
                if(out[ele]==0){
                    q.add(ele);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}