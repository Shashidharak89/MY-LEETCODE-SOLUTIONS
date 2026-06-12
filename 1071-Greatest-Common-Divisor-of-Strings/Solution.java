class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String ans = "";
        String s1 = str1;
        String s2 = str2;
        int n = s1.length();
        for (int i = 1; i <= n; i++) {
            s1 = str1;
            s2 = str2;
            String ss = s1.substring(0, i);
            if (s2.contains(ss)) {
                s1 = s1.replaceAll(ss, "");
                s2 = s2.replaceAll(ss, "");
            }
            if (s1.equals("") && s2.equals("")) {
                if (ss.length() > ans.length()) {
                    ans = ss;
                }
            }
        }
        return ans;

    }
}