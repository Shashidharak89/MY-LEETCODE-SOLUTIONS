class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int temp = n;
        int prod = 1;
        while (temp != 0) {
            int num = temp % 10;
            sum += num;
            prod = prod * num;
            temp /= 10;
        }
        int ans = prod + sum;
        return n % ans == 0;
    }
}