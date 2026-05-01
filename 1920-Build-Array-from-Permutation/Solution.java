class Solution {
    public int[] buildArray(int[] nums) {
        int i;
        int temp[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            temp[i]=nums[nums[i]];
        }
        return temp;
    }
}