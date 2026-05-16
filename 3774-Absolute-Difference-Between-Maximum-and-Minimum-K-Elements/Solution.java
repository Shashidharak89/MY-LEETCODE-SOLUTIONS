class Solution {
    public int absDifference(int[] nums, int k) {
        int max=0,min=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<k;i++){
            min+=nums[i];
            max+=nums[n-1-i];
        }
        return Math.abs(max-min);
    }
}