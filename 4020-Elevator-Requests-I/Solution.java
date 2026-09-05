class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int diff = 0;
        int prev = 0;
        for (int i = 0; i < requests.length; i++) {
            diff += Math.abs(prev - requests[i]);
            prev = requests[i];
        }
        return diff;
    }
}