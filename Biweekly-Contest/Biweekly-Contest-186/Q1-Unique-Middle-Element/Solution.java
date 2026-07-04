class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int ele = nums[n / 2];
        for (int i = 0; i < n; i++) {
            if (i == n / 2) {
                continue;
            }
            if (nums[i] == ele) {
                return false;
            }

        }
        return true;
    }
}