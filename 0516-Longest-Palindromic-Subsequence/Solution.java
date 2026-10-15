class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        char a1[] = s.toCharArray();
        char a2[] = sb.toString().toCharArray();
        return lcs(n - 1, n - 1, a1, a2, dp);
    }

    int lcs(int index1, int index2, char a1[], char a2[], int dp[][]) {
        if (index1 < 0 || index2 < 0) {
            return 0;
        }
        if (dp[index1][index2] != -1) {
            return dp[index1][index2];
        }
        if (a1[index1] == a2[index2]) {
            dp[index1][index2] = 1 + lcs(index1 - 1, index2 - 1, a1, a2, dp);
            return dp[index1][index2];
        }
        dp[index1][index2] = Math.max(lcs(index1 - 1, index2, a1, a2, dp), lcs(index1, index2 - 1, a1, a2, dp));
        return dp[index1][index2];
    }
}