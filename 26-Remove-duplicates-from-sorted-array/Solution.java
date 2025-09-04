import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0,i;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[a]){
                nums[++a]=nums[i];
            }
        }
        return a+1;
    }
}