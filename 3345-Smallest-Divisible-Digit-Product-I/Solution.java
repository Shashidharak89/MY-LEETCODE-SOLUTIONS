class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        while (i <= 100) {
            if (getProductOfDigits(i) % t == 0) {
                return i;
            }
            i++;
        }
        return n;
    }

    int getProductOfDigits(int num) {
        int prod = 1;
        while (num != 0) {
            prod = prod * (num % 10);
            num /= 10;
        }
        return prod;
    }
}