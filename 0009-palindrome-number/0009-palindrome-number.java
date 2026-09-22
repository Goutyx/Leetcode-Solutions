class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int n = 0;
        while(x>0){
            int digit = x%10;
            n = n*10 + digit;
            x/=10; 
        }

        if(copy == n){
            return true;
        }
        return false;
    }
}