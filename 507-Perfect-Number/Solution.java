class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=0;
        for(int i=1;i<=num/2;i++){
            if(isDivisible(i,num)){
                count+=i;
            }
        }
        return count==num;
    }
    boolean isDivisible(int ele, int n){
        return n%ele==0;
    }
}