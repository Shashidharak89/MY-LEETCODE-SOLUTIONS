class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int ele : banned) {
            set.add(ele);
        }

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            if (sum + i <= maxSum) {
                count++;
                sum += i;
            } else {
                break;
            }
        }
        return count;
    }
}