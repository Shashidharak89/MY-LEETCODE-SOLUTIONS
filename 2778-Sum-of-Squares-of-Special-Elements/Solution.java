class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int i = 1;
        int sum = 0;
        for (i = 1; i <= n; i++) {
            int index = i - 1;
            if (n % i == 0) {
                sum += (nums[index] * nums[index]);
            }
        }
        return sum;
    }
}