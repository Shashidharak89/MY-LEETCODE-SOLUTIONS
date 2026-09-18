class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int forward[] = new int[n];
        int backward[] = new int[n];
        forward[0] = nums[0];
        backward[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            forward[i] = forward[i - 1] + nums[i];
            backward[n - i - 1] = backward[n - i] + nums[n - i - 1];
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if ((forward[i] - backward[i + 1]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}