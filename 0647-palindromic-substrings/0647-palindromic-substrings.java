class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count=count+expand(s, i, i);
            count=count+expand(s, i, i+1);
        }

        return count;
    }

    public int expand(String s, int left, int right){
        int cmt=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            cmt++;
            left--;
            right++;
        }
        return cmt;
    }
}