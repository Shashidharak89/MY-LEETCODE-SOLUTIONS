class Solution {
    public int[] getNoZeroIntegers(int n) {
        int ans[] = new int[2];
        for (int i = 1; i < n; i++) {
            String num1 = String.valueOf(i);
            String num2 = String.valueOf(n - i);
            if (!num1.contains("0") && !num2.contains("0")) {
                ans[0] = i;
                ans[1] = n - i;
                return ans;
            }
        }
        return ans;
    }
}