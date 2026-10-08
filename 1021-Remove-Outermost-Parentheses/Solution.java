class Solution {
    public String removeOuterParentheses(String s) {
        int prev = 0;
        int ct = 0;
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                ct++;
            } else {
                ct--;
            }
            if (ct == 0) {
                st += s.substring(prev + 1, i);
                prev = i + 1;
            }
        }
        return st;
    }
}