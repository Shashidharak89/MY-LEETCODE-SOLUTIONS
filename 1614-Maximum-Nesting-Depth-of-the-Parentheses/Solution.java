class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxlen = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count > maxlen) {
                maxlen = count;
            }
        }
        return maxlen;
    }
}