class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merge=new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]=nums1[i];
        }
        for(int j=0;j<m;j++){
            merge[j+n]=nums2[j];
        }
        Arrays.sort(merge);
        double median;
        int z=merge.length;
        if(z%2==0){
            int k=z/2;
            median=(merge[k]+merge[k-1])/2.0;
        }else{
            int o=z/2;
            median=merge[o];
        }
        return median;
    }
}