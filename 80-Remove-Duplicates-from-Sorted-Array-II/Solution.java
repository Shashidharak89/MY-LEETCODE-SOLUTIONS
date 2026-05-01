import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i,j=0,count=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>=nums[j] && j>1){
                if(nums[i]!=nums[j-2] ){
                    nums[j++]=nums[i];
                }
            }
            else if(j==0 || j==1){
                nums[j++]=nums[i];
            }
        }
        return j;

    }
}