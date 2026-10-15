class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        getSubset(nums, stack, 0);
        return list;
    }

    void getSubset(int nums[], Stack<Integer> stack, int i) {
        if (i == nums.length) {
            List<Integer> l = new ArrayList<>(stack);
            list.add(l);
            return;
        }
        stack.push(nums[i]);
        getSubset(nums, stack, i + 1);
        stack.pop();
        getSubset(nums, stack, i + 1);
    }

}