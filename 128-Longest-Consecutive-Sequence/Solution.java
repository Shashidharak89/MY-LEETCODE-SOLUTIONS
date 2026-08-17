class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int j = 0;
        int prev = 0;
        int max = 1;
        int curr = 1;
        for (Integer ele : set) {
            if (j == 0) {
                prev = ele;
                j++;
                continue;
            }
            if (ele - 1 == prev) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 1;
            }
            prev = ele;
        }
        return max;
    }
}