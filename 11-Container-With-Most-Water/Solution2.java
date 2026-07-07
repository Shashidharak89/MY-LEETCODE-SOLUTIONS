class Solution {
    public int maxArea(int[] height) {
        int st=0,end=height.length-1;
        int ans=0;
        while(st<end){
            int min=Math.min(height[st],height[end]);
            int dis=end-st;
            ans=Math.max(ans,dis*min);
            if(height[end]<height[st]){
                end--;
            }
            else{
                st++;
            }
        }
        return ans;
    }
}