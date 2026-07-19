class Solution {
    public boolean canReach(int[] start, int[] target) {
        int s = start[0] + start[1];
        int e = target[0] + target[1];

        if (s % 2 == e % 2) {
            return true;
        }
        return false;
    }
}