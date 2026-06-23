class Solution {
    public boolean checkGoodInteger(int n) {
        int dig=0;
        int sqr=0;
        while(n!=0){
            dig+=n%10;
            sqr+=(n%10)*(n%10);
            n/=10;
        }
        if(sqr-dig>=50){
            return true;
        }
        return false;
    }
}