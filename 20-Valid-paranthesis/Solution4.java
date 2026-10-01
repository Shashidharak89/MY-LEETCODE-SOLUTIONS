class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return false;
                }
                char p = stack.pop();
                if ((p == '(' && c != ')') || (p == '[' && c != ']') || (p == '{' && c != '}')) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}