class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(i==k){
                return nums[n-i];
            }
        }
        return nums[0];
    }
}