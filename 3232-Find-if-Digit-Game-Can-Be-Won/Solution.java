class Solution {
    public boolean canAliceWin(int[] nums) {
        int sgl=0,dbl=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sgl+=nums[i];
            }
            else{
                dbl+=nums[i];
            }
        }

        return sgl==dbl?false:true;
    }
}