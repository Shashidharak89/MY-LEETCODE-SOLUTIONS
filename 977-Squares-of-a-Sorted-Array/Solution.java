class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++){
            arr[i]*=arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}