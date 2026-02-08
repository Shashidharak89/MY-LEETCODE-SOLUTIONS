class Solution {
    public int dominantIndices(int[] nums) {
    int dominant=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>findAvg(nums,i+1)){
                dominant++;
            }
        }
        return dominant;
        
    }
    double findAvg(int[] nums,int start){
        if(start==nums.length){
            return 0;
        }
        int sum=0;
        for(int i=start;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum/(nums.length-start);
    }
}