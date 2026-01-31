class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder arr = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            arr.append(str[i]);
            if(i != 0){
                arr.append(" ");
            }
        }
        return arr.toString();
    }
}