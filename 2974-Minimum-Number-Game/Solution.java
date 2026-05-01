class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[]=new int[n];
        int i=0,j=0;
        while(i<n){
            arr[j++]=nums[i+1];
            arr[j++]=nums[i];
            i+=2;
        }
        return arr;
    }
}