class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(map.containsKey(a)){
                int x = map.get(a);
                map.put(a, x+1);
            }else{
                map.put(a,1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}