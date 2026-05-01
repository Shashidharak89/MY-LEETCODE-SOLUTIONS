class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length,mid;
        int start=0,end=n-1,ans=0;
         if(target<=nums[0]){
            return 0;
        }
        if(nums.length==2){
            if(nums[1]==target){
                return 1;
            }
            else{
                if(target>=nums[0] && target<=nums[1]){
                    return 1;
                }
                else{
                    return 2;
                }
            }
        }
        while(start<=end){
            mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
               
                
            }
            else{
                start=mid+1;
                ans=start;
                
            }
        }
       
        return ans;
        
    }
}