class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return false;
            }
        }
        if(arr[0]==max || arr[arr.length-1]==max){
            return false;
        }
        int j = 0;
        while(arr[j]!=max){
            if(arr[j]>arr[j+1]){
                return false;
            }
            j++;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                return false;
            }
        }
        return true;
    }
}