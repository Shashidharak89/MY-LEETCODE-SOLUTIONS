class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        int count = 0;
        for (Integer ele : map.keySet()) {
            List<Integer> l = map.get(ele);
            boolean flag = true;
            for (int i = 1; i < l.size(); i++) {
                if (l.get(i) - l.get(i - 1) != 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}