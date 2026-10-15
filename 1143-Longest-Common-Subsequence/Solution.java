class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char c1[] = text1.toCharArray();
        char c2[] = text2.toCharArray();
        int dp[][] = new int[c1.length][c2.length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return lcs(c1.length - 1, c2.length - 1, c1, c2, dp);
    }

    int lcs(int index1, int index2, char c1[], char c2[], int dp[][]) {
        if (index1 < 0 || index2 < 0) {
            return 0;
        }
        if (dp[index1][index2] != -1) {
            return dp[index1][index2];
        }
        if (c1[index1] == c2[index2]) {
            dp[index1][index2] = 1 + lcs(index1 - 1, index2 - 1, c1, c2, dp);
            return dp[index1][index2];
        }
        dp[index1][index2] = Math.max(lcs(index1 - 1, index2, c1, c2, dp), lcs(index1, index2 - 1, c1, c2, dp));
        return dp[index1][index2];
    }
}