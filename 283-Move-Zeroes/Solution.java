class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            return;
        }
        int i=0,j=0;
        int arr[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j++]=nums[i];
            }
        }
        for(i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }

    }
}