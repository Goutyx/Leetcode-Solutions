class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i=0;i<bits.length;i++){
            if(bits[i]==1){
                i++;

                if(i==bits.length-1){
                    return false;
                }
            }else{
                if(i==bits.length-1){
                    return true;
                }
            }
        }
        return true;
    }
}