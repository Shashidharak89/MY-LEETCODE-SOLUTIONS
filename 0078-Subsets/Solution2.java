class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        subset(nums, 0, stack);
        return list;
    }

    void subset(int nums[], int i, Stack<Integer> stack) {
        if (i == nums.length) {
            ArrayList<Integer> a = new ArrayList<>(stack);
            list.add(a);
            return;
        }
        stack.push(nums[i]);
        subset(nums, i + 1, stack);
        stack.pop();
        subset(nums, i + 1, stack);
    }
}