class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int i;
        for (i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (i = 1; i <= 100; i++) {
            if (!set.contains(k * i)) {
                return k * i;
            }
        }
        return k * i;
    }
}