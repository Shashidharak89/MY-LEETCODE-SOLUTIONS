class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i;
        int arr[]=new int[nums.length];
        int count=0;
        for(i=0;i<nums.length/2;i++){
            arr[count]=nums[i];
            count+=2;
            arr[count-1]=nums[i+n];
            
        }
        
        return arr;
    }
}