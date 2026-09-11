class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && k != i) {
                        int ans = 0;
                        ans += digits[i];
                        ans = (ans * 10) + digits[j];
                        ans = (ans * 10) + digits[k];
                        if (ans % 2 == 0 && ans > 99) {
                            set.add(ans);
                        }
                    }
                }
            }
        }
        return set.size();
    }
}