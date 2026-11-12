class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int prev = 0;
        int n = nums.length;
        int maxlen = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                maxlen = Math.max(maxlen, i - prev + 1);
            } else {
                prev = i;
            }
        }
        prev = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                maxlen = Math.max(maxlen, i - prev + 1);
            } else {
                prev = i;
            }
        }
        return maxlen;
    }
}