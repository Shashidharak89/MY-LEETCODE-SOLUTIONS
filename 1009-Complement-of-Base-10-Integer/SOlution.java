class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String t="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                t=t+'1';
            }
            else{
                t=t+'0';
            }
        }
        return Integer.parseInt(t,2);
    }
}