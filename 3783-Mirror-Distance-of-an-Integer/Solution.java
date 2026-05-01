class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    int reverse(int num){
        int ans=0;
        while(num!=0){
            int temp=num%10;
            ans=(ans*10)+temp;
            num/=10;    
        }
        return ans;
    }
}