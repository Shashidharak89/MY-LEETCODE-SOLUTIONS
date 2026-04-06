class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0,n=columnTitle.length();
        for(int i=0;i<n;i++){
            int ch=columnTitle.charAt(n-i-1)-'A'+1;
            ans=ans+(ch*pow(26,i));
        }
        return ans;
    }
    int pow(int n,int t){
        int num=1;
        for(int i=0;i<t;i++){
            num=num*n;
        }
        return num;
    }
}