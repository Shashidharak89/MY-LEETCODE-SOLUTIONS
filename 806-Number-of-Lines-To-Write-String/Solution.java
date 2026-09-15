class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int has = 0;
        int ans[] = new int[2];
        ans[0] = 1;
        for (char c : s.toCharArray()) {
            int weight = widths[(int) c - 'a'];
            if (has + weight <= 100) {
                has += weight;
            } else {
                has = weight;
                ans[0]++;
            }
        }
        ans[1] = has;
        return ans;
    }
}