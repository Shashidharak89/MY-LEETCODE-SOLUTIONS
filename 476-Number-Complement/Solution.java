class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        String ans="";
        for(int i=0;i<s.length();i++){
            ans+=s.charAt(i)=='1'?'0':'1';
        }
        return Integer.parseInt(ans,2);
    }
}