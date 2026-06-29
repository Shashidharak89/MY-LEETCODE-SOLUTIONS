class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());

        for (Integer ele : set1) {
            if (!set2.contains(ele)) {
                list.get(0).add(ele);
            }
        }
        for (Integer ele : set2) {
            if (!set1.contains(ele)) {
                list.get(1).add(ele);
            }
        }
        return list;

    }
}