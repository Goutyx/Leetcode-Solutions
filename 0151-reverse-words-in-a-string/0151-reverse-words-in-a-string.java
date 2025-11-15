class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        String[] newarr=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            newarr[j]=arr[i];
            j++;
        }
        return String.join(" ", newarr);
    }
}