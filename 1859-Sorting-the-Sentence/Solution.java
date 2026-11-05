class Solution {
    public String sortSentence(String s) {
        String arr[] = s.trim().split("\\s+");
        String ans[] = new String[arr.length];
        for (String str : arr) {
            int len = str.length();
            int index = str.charAt(len - 1) - '1';
            ans[index] = str.substring(0, len - 1);
        }
        String res = ans[0];
        for (int i = 1; i < ans.length; i++) {
            res = res + " " + ans[i];
        }
        return res;
    }
}