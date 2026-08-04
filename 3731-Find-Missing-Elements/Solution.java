class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}