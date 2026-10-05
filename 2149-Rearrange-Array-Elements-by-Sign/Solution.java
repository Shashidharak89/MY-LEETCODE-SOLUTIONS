class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int neg = 1;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                arr[neg] = nums[i];
                neg += 2;
            } else {
                arr[pos] = nums[i];
                pos += 2;
            }
        }
        return arr;
    }
}