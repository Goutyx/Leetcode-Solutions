class Solution {
    public boolean isPalindrome(int x) {
        int o=x;
        if(x<0){
            return false;
        }
        int y=0;
        while(x>0){
            int digit=x%10;
            y=y*10+digit;
            x/=10;
        }
        if(o==y){
            return true;
        }else{
            return false;
        }
    }
}