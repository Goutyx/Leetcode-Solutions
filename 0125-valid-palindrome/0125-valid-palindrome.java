class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int first = 0;
        int last = s.length()-1;

        while(first<last){
            char a = s.charAt(first);
            char b = s.charAt(last);

            if(!((a>='a' && a<='z') || (a>='0' && a<='9'))){
                first++;
                continue;
            }

            if(!((b>='a' && b<='z') || (b>='0' && b<='9'))){
                last--;
                continue;
            }

            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}