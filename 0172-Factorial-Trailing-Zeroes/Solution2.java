class Solution {
    public int trailingZeroes(int n) {
        Set<Integer> set = new HashSet<>();
        int num = 5;
        while (num <= n) {
            set.add(num);
            num = num * 5;
        }
        int count = 0;
        for (Integer ele : set) {
            int e = n / ele;
            count += e;
        }
        return count;
    }
}