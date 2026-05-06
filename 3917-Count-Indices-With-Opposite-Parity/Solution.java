class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int rem = nums[i] % 2;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]%2!=rem){
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}