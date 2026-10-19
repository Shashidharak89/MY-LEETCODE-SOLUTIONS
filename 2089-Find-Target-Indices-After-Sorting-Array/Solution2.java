class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, less = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                less++;
            } else if (nums[i] == target) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            list.add(less++);
        }
        return list;
    }
}