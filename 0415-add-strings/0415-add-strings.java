class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int a,b;

        while(i>=0 || j>=0 || carry != 0){
            if(i>=0){
                a = num1.charAt(i) - '0';
            }else{
                a = 0;
            }

            if(j>=0){
                b = num2.charAt(j) - '0';
            }else{
                b = 0;
            }

            i--;
            j--;
            int sum = a+b+carry;
            sb.insert(0,sum%10);
            carry = sum/10;
        }
        return sb.toString();
    }
}