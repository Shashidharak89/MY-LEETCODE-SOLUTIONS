import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();

        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                s1.append(c);
            }
        }

        StringBuilder s2 = new StringBuilder(s1);
        s1.reverse();
        return s1.toString().equals(s2.toString());
    }
}
