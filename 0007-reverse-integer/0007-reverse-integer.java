class Solution {
    public int reverse(int x) {
        int o=x;
        long n=0;
        if(x<0){
            x=-(x);
        }

        while(x!=0){
            int digit=x%10;
            n=n*10+digit;
            x/=10;
        }
        if(n>=(int)(Math.pow(2,31)-1)){
            return 0;
        }
        if(n<=(int)(Math.pow(-2,31))){
            return 0;
        }


        if(o>0){
            return (int)n;
        }else if(o<0){
            return -(int)(n);
        }else{
            return 0;
        }
    }
}