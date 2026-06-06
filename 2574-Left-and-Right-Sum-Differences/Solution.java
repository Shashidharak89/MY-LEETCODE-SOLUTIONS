class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        if(n==1){
            return new int[]{0};
        }
        int right[]=new int[n];
        int left[]=new int[n];
        int ans[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            int index=n-1-i;
            sum+=nums[index];
            right[index]=sum;
        }
        sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            left[i]=sum;
        }
        ans[0]=right[1];
        ans[n-1]=left[n-2];

        for(int i=1;i<n-1;i++){
            ans[i]=Math.abs(right[i+1]-left[i-1]);
        }
        return ans;
    }
}