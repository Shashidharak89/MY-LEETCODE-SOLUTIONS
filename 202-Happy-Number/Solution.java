class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int tm = getSum(n);
            System.out.println(tm);
            if (set.contains(tm)) {
                return false;
            }
            set.add(tm);
            n = tm;
        }
        return true;
    }

    int getSum(int num) {
        int temp = 0;
        while (num != 0) {
            int t = num % 10;
            temp = temp + (t * t);
            num /= 10;
        }
        return temp;
    }
}