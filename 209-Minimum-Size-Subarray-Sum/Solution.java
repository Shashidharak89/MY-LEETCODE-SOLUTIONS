class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = nums[0];
        boolean flag = false;

        while (start <= end && end < nums.length) {
            if (sum >= target && end - start + 1 < minlen) {
                flag = true;
                minlen = end - start + 1;
                sum -= nums[start];
                start++;
            } else if (sum < target && end < nums.length - 1) {
                end++;
                sum += nums[end];
            } else {
                sum -= nums[start];
                start++;
            }
        }
        if (!flag) {
            return 0;
        }
        return minlen;
    }
}