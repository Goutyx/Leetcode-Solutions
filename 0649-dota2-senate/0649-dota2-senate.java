class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue <Integer> q1 = new LinkedList<>();
        Queue <Integer> q2 = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                q1.add(i);
            }else{
                q2.add(i);
            }
        }

        while(!q1.isEmpty() && !q2.isEmpty()){
            int a = q1.remove();
            int b = q2.remove();

            if(a<b){
                q1.add(a+n);
            }else{
                q2.add(b+n);
            }
        }

        if(q1.isEmpty()){
            return "Dire";
        }else{
            return "Radiant";
        }
    }
}