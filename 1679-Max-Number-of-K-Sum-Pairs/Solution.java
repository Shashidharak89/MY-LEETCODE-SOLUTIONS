class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int st=0,end=nums.length-1;
        while(st<end){
            int ele=nums[st]+nums[end];
            if(ele==k){
                count++;
                st++;
                end--;
            }
            else if(ele<k){
                st++;
            }
            else{
                end--;
            }
        }
        return count;
    }
}