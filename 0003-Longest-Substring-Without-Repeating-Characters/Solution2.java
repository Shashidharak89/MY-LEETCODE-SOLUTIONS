class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q = new LinkedList<>();
        int maxlen = 0;
        int len = 0;

        for (char c : s.toCharArray()) {
            if (!q.contains(c)) {
                len++;
                q.add(c);
            } else {
                char ch = '\0';
                while (ch != c) {
                    ch = q.poll();
                    len--;
                }
                q.add(c);
                len++;
            }
            maxlen = Math.max(len, maxlen);
        }
        return maxlen;
    }
}