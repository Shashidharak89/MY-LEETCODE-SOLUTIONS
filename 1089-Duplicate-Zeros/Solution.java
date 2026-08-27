class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = 0; i < n && j < n; i++) {
            ans[j++] = arr[i];
            if (arr[i] == 0 && j < n) {
                ans[j++] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
}