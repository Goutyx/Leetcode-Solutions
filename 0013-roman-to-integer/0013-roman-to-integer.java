class Solution {
    public int fun(char ch){
        if(ch=='I'){
            return 1;
        }else if(ch=='V'){
            return 5;
        }else if(ch=='X'){
            return 10;
        }else if(ch=='L'){
            return 50;
        }else if(ch=='C'){
            return 100;
        }else if(ch=='D'){
            return 500;
        }else{
            return 1000;
        }
    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int cur=fun(s.charAt(i));
            int next=fun(s.charAt(i+1));

            if(cur<next){
                sum=sum-cur;
            }else{
                sum=sum+cur;
            }
        }
        sum += fun(s.charAt(s.length() - 1));
        return sum;
    }
}