class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans=0;
        int prefix[]=new int [nums.length];
        int max=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int ind=n-i-1;
            max=Math.max(nums[ind],max);
            prefix[ind]=max;
        }
        for(int i=0;i<nums.length-k;i++){
            ans=Math.max(nums[i]+prefix[i+k],ans);
        }
        return ans;
    }
}