class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;

        do{
            fast=findsum(findsum(fast));
            slow=findsum(slow);
        }while(slow != fast);

        return slow==1;
    }

    public int findsum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit);
            n /= 10;
        }
        return sum;
    }
}