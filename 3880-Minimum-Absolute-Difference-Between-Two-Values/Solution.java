class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int one = -1, two = -1;
        int mindiff=100;
        for (int i = 0; i < nums.length; i++) {
         if(nums[i]==1){
            one=i;
         }
         else if(nums[i]==2){
            two=i;
         }
         if(one!=-1 && two!=-1){
            mindiff=Math.min(Math.abs(two-one),mindiff);
         }
        }
        if(one==-1 || two==-1){
            return -1;
        }
        return mindiff;
    }
}