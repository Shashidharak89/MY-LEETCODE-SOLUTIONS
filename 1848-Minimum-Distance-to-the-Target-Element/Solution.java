class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int index=-1;
        int mindistance=1000;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
                mindistance=Math.min(mindistance,Math.abs(start-index));
            }
        }
        return mindistance;
    }
}