class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i,j;
        int arr[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(i!=j && nums[j]<nums[i]){
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}