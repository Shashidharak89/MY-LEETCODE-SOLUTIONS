class Solution {
    public boolean consecutiveSetBits(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        int len=s.length();
        int st=0,end=1;
        while(end<len && st<len-1){
            if(s.charAt(st)=='1' && s.charAt(end)=='1'){
                count++;
            }
            st++;
            end++;
        }
        if(count==1){
            return true;
        }
        return false;
    }
}