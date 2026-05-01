class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];

        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    ans[i]=j-i;
                    break;
                }
            }
        }
        return ans;
    }
}