class Solution {
    public boolean canAliceWin(int n) {
        int count = 10;
        while (n >= 0) {
            n = n - count;
            if (n < 0) {
                return false;
            }
            count--;
            n = n - count;
            if (n < 0) {
                return true;
            }
            count--;
        }
        return false;
    }
}