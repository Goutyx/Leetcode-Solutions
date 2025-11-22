class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double avg=0;

        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
        }

        for(int i:salary){
            if(i!=max && i!=min){
                avg=avg+i;
            }
        }

        return avg/(salary.length-2);

    }
}