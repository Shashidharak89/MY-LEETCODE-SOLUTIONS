class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int count=0;
        if(n%2==1){
            arr[count++]=0;
        }
        int val=1;
        while(count<n){
            arr[count++]=val;
            arr[count++]=-val;
            val++;
        }
        return arr;
    }
}