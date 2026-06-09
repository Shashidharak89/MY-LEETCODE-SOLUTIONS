class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]%2;
        }
        Arrays.sort(nums);
        return nums;
    }
}