class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0;
        int i;
        int q=0,r=0;
        boolean inc=false,dec=false,l=false;

        for(i=0;i<nums.length-1;i++){
            p=i;
            if(nums[i]>=nums[i+1]){
                break;
            }
            else{
                inc=true;
            }
        }
        for(i=p;i<nums.length-1;i++){
            q=i;
            if(nums[i]<=nums[i+1]){
                break;
            }
            else{
                dec=true;
            }
        }
        for(r=q;i<nums.length-1;i++){
            r=i;
            if(nums[i]>=nums[i+1]){
                break;
            }
            else{
                l=true;
            }
        }

        if(i==nums.length-1 && inc && dec && l ){
            return true;
        }
        return false;
    }
}