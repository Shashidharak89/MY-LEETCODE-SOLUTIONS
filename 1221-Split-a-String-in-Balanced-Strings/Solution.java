class Solution {
    public int balancedStringSplit(String s) {
        int r = 0, l = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                r++;
            } else {
                l++;
            }
            if (r == l) {
                count++;
            }
        }
        return count;
    }
}