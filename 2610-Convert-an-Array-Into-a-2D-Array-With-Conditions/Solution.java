class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int count = 0;
        int n = nums.length;
        while (count < n) {
            Set<Integer> set = new LinkedHashSet<>();
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0 && !set.contains(nums[i])) {
                    set.add(nums[i]);
                    count++;
                    nums[i] = -1;
                }
            }
            List<Integer> l = new ArrayList<>();
            for (Integer ele : set) {
                l.add(ele);
            }
            list.add(l);
        }

        return list;
    }
}