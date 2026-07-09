class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int a = 26 - ((int) c - 'a');
            System.out.println(a);

            ans += (a * (i + 1));
        }
        return ans;
    }
}