class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.trim().split(" ");
        String m=arr[arr.length-1];
        return m.length();
    }
}