class Solution {
    public int binaryGap(int n) {
        String bit=Integer.toBinaryString(n);
        int start=0,max=0;
        for(int i=0;i<bit.length();i++){
            if(bit.charAt(i)=='1'){
                if(i-start>max){
                    max=i-start;
                }
                start=i;
            }
        }
        return max;
    }
}