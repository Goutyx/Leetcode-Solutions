class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                int left1 = i;
                int right1 = j-1;
                int left2 = i+1;
                int right2 = j;

                while(left1 < right1){
                    if(s.charAt(left1)==s.charAt(right1)){
                        left1++;
                        right1--;
                    }else{
                        break;
                    }
                }
                while(left2 < right2){
                    if(s.charAt(left2)==s.charAt(right2)){
                        left2++;
                        right2--;
                    }else{
                        break;
                    }
                }
                return left1>=right1 || left2 >=right2;
            }
        } 
        return true;
    }
}