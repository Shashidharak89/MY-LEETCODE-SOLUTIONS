class Solution {
    public boolean isMonotonic(int[] nums) {
        int order1=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                order1++;
            }
            else{
                break;
            }
        }
        int order2=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                order2++;
            }
            else{
                break;
            }
        }
        if(nums.length-1==order1 || nums.length-1==order2){
            return true;
        }
        return false;
        
    }
}