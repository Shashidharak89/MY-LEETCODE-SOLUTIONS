class Solution {
    public String convertDateToBinary(String date) {
        String d=date.substring(0,4);
        String m=date.substring(5,7);
        String y=date.substring(8,10);

        String dt=Integer.toBinaryString(Integer.valueOf(d));
        String mn=Integer.toBinaryString(Integer.valueOf(m));
        String yr=Integer.toBinaryString(Integer.valueOf(y));

        String ans=dt+"-"+mn+"-"+yr;
        return ans;
    }
}