class Solution {
    public int maximumGap(int[] nums) {
        int maxdiff=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int diff=Math.abs(nums[i-1]-nums[i]);
            maxdiff=Math.max(maxdiff,diff);
        }
        return maxdiff;
    }
}