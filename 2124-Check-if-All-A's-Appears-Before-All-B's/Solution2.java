class Solution {
    public boolean checkString(String s) {
        int b = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' && b != 0) {
                return false;
            }
            if (c == 'b') {
                b = 1;
            }
        }
        return true;
    }
}