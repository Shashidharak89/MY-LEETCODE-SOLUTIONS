class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int c=0;
        while(c<bits.length){
            if(c==bits.length-1){
                return true;
            }
            if(bits[c]==0){
                c++;
            }
            else{
                c+=2;
            }
        }
        return false;
    }
}