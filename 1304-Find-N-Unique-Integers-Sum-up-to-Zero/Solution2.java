class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int sum=0;
        for(int i=1;i<n;i++){
            arr[i-1]=i;
            sum+=i;
        }
        arr[n-1]=-sum;
        return arr;
    }
}