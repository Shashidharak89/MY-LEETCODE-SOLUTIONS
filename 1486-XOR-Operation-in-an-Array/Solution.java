class Solution {
    public int xorOperation(int n, int start) {
        int i=0;
        int ans=start;
        for(i=1;i<n;i++){
            ans=ans^(start+(2*i));
        }
        return ans;
    }
}