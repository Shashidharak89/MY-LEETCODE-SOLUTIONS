class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int maxlen = 0;
        int zero = 0;
        while (r < nums.length) {

            if (nums[r] == 1) {
                r++;
            } else {
                r++;
                zero++;
            }
            while (zero > k && r < nums.length) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
            }
            if (zero <= k)
                maxlen = Math.max(maxlen, r - l);
        }
        return maxlen;
    }
}