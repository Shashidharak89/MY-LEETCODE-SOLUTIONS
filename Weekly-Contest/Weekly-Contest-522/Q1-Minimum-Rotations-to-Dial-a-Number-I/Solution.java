class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int pointer = 0;
        for (char c : s.toCharArray()) {
            int num = (int) ((char) c - '0');
            int min = getmin(Math.abs(num - pointer), pointer + 10 - num, Math.abs(pointer - 10 - num));
            ans += min;
            pointer = num;
        }
        return ans;
    }

    int getmin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        }
        return c;
    }
}