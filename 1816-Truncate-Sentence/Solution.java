class Solution {
    public String truncateSentence(String s, int k) {
        String arr[] = s.trim().split("\\s+");
        String t = arr[0];

        for (int i = 1; i < k; i++) {
            t = t + " " + arr[i];
        }
        return t;
    }
}