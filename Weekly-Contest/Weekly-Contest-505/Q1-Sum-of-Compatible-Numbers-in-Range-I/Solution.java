class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int count=0;
        int terminator=200;
        for(int i=0;i<terminator;i++){
            if((i&n)==0 && Math.abs(n-i)<=k){
                count+=i;
            }
        }
        return count;
    }
}