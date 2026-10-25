class Solution {
    public int calculateScore(int a, int b) {
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);
        int n1 = countOnes(s1);
        int n2 = countOnes(s2);
        if (n1 >= n2) {
            return n1 * n2;
        }
        return n2 / n1;
    }

    int countOnes(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}