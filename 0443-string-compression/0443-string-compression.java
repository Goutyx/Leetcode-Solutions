class Solution {
    public int compress(char[] chars) {
        int count=1;
        int j=0;
        for(int i=1;i<=chars.length;i++){
            if(i<chars.length && chars[i]==chars[i-1]){
                count++;
            }else{
                chars[j]=chars[i-1];
                j++;
                if(count>1){
                    String m=String.valueOf(count);
                    for(char ch: m.toCharArray()){
                        chars[j]=ch;
                        j++;
                    }
                }
                count=1;
            }
        }
        return j;
    }
}