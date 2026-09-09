class Solution {
    public long countCommas(long n) {
        if (n < 1000) {
            return 0;
        }
        long comma = 0;
        long num = 999;
        if (n > num) {
            comma += n - num;
        }
        num = 999999;
        if (n > num) {
            comma += n - num;
        }
        num = 999999999l;
        if (n > num) {
            comma += n - num;
        }
        num = 999999999999l;
        if (n > num) {
            comma += n - num;
        }
        num = 999999999999999l;
        if (n > num) {
            comma += n - num;
        }
        return comma;
    }
}