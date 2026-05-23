class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int c=0;
        for(int i=0;i<count;i++){
            if(nums[n-1-i]==0){
                c++;
            }
        }
        return count-c;
    }
}