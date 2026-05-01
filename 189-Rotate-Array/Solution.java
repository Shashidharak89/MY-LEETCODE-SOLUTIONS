import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1 || nums.length==0){
            return;
        }
        reverse_array(nums,nums.length,0);
        reverse_array(nums,k%nums.length,0);
        reverse_array(nums,nums.length,k%nums.length);
    }
    public void reverse_array(int nums[],int n,int index){
        int i,id=0;
        for(i=index;i<(n-index)/2+index;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-id];
            nums[n-1-id]=temp;
            id++;
        }
    }
}