class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            findmin(nums, multiplier);
        }
        return nums;
    }

    void findmin(int[] nums, int multiplier) {
        int min = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            }
        }
        nums[min] = nums[min] * multiplier;
    }
}