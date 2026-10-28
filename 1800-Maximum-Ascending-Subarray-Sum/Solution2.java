class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else{
                sum=nums[i];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}