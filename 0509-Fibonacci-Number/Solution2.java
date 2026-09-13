class Solution {
    public int fib(int n) {
        int arr[] = new int[n + 1];
        return fibonecci(n, arr);
    }

    int fibonecci(int n, int[] arr) {
        if (n <= 1) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = fibonecci(n - 1, arr) + fibonecci(n - 2, arr);
        return arr[n];
    }
}