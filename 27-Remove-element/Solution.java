import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int a=0,i,temp;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                a++;
            }
        }
        return a;
    }
}