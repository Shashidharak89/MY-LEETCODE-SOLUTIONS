class Solution {
    int ans;

    public int subsetXORSum(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        subset(nums, 0, nums.length, stack);
        return ans;
    }

    void subset(int[] nums, int i, int n, Stack<Integer> stack) {
        if (i == n) {
            int sum = 0;
            for (Integer ele : stack) {
                sum = sum ^ ele;
            }
            ans += sum;
            return;
        }
        stack.push(nums[i]);
        subset(nums, i + 1, n, stack);
        stack.pop();
        subset(nums, i + 1, n, stack);
    }
}