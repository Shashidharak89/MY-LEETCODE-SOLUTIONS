class Solution {
    public int[] constructTransformedArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int i;
        int arr[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            int index=i+nums[i];
            index%=nums.length;
            if(index<0){
                index=nums.length+index;    
            }   
            arr[i]=nums[index];
        }
        return arr;
    }
}