class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int rem = 1;
        int n=digits.length;
        for (int i = 0; i < n; i++) {
            int index = n - i - 1;
            if (digits[index] + rem == 10) {
                list.add(0);
            } else {
                list.add(digits[index] + rem);
                rem = 0;
            }
        }
        if (rem == 1) {
            list.add(1);
        }
        Collections.reverse(list);
        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}