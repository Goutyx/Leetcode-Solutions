class Solution {
    public int myAtoi(String s) {
        int i=0;
        long digit=0;
        int sign=1;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int num=s.charAt(i) - '0';
            digit=digit*10+num;

            if(sign==1 && digit>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1 && -digit<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)digit*sign;
    }
}