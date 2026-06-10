class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int st=0,end=n-1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[st++]=0;
            }
            else{
                arr[end--]=1;
            }
        }
        
        return arr;
    }
}