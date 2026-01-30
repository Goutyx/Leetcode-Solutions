class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();

        sorting(ss);
        sorting(tt);

        return Arrays.equals(ss, tt);
    }

    public void sorting(char[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            char key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}