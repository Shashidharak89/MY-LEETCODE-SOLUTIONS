class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxProd = (nums[0] - 1) * (nums[1] - 1);
        maxProd = Math.max((nums[n - 1] - 1) * (nums[n - 2] - 1), maxProd);
        return maxProd;
    }
}