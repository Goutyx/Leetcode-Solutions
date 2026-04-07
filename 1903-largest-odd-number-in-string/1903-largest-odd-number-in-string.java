class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        int count = 0;

        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='2' || num.charAt(i)=='4' || num.charAt(i)=='6' || num.charAt(i)=='8' || num.charAt(i)=='0'){
                count++;
            }else{
                break;
            }
        }

        for(int i=0;i<count;i++){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}