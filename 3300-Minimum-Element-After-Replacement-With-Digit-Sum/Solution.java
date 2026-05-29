class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int ans=0;
            while(ele!=0){
                ans=(ans)+(ele%10);
                ele/=10;
            }
            min=Math.min(min,ans);
        }
        return min;
    }
}