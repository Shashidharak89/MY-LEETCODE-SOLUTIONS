class Solution {
    public boolean validDigit(int n, int x) {
        int first=0;
        int flag=0;
        while(n!=0){
            first=n%10;
            if(first==x){
                flag=1;
            }
            n/=10;
        }
        if(flag==1 && first!=x){
            return true;
        }
        return false;
    }
}