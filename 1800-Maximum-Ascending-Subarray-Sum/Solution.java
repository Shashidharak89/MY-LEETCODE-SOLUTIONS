class Solution {
    public int maxAscendingSum(int[] nums) {
        int prev = nums[0];
        int maxsum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            maxsum = Math.max(sum, maxsum);
            prev = nums[i];
        }
        return maxsum;
    }
}