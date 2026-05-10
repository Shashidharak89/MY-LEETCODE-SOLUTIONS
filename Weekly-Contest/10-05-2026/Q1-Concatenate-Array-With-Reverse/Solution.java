class Solution {
    public int[] concatWithReverse(int[] nums) {
       int n=nums.length;
        int arr[]=new int[n*2];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            arr[n+i]=nums[n-i-1];
        }
        return arr;
    }
}