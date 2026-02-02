class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        // if(r==0 || c==0 || matrix==null){
        //     return false;
        // }

        int start = 0;
        int end = c-1;

        while(start<r && end>=0){
            if(matrix[start][end]==target){
                return true;
            }else if(matrix[start][end]>target){
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
}