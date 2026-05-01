import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int a=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[a++]=nums[i];
            }
        }
        return a;
    }
}