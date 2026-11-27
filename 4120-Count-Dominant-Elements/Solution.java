class Solution {
    public int countDominantElements(int[] nums) {
        int count = 0;
        int n = nums.length;
        if (n == 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (nums[i] >= nums[i + 1]) {
                    count++;
                }
                continue;
            } else if (i == n - 1) {
                if (nums[i] >= nums[i - 1]) {
                    count++;
                }
                continue;
            }
            if (nums[i] >= (float) (nums[i - 1] + nums[i + 1]) / 2.0) {
                count++;
            }
        }
        return count;
    }
}