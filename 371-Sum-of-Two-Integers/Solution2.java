class Solution {
    public int getSum(int a, int b) {
        int op1=a;
        int carry=b;
        while(carry!=0){
            op1=a^b;
            carry=a&b;
            carry=carry<<1;
            a=op1;
            b=carry;
        }
        return a;
    }
}