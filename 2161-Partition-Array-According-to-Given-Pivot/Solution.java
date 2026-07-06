class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int c=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[c++]=nums[i];
            }
            else if(nums[i]==pivot){
                p++;
            }
        }
        for(int i=0;i<p;i++){
            ans[c++]=pivot;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[c++]=nums[i];
            }
        }
        return ans;
    }
}