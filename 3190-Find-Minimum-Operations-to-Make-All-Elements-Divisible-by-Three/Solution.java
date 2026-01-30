class Solution {
    public int minimumOperations(int[] nums) {
        int i,count=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]%3==0){
                continue;
            }
            else if(nums[i]%3==1 || nums[i]%3==2){
                count++;
            }
        }
        return count;
    }
}