class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int esum=0;
        int dsum=0;

        int i,j;
        for(i=0;i<n;i++){
            esum+=nums[i];
            int el=nums[i];
            int temp=0;
            while(el!=0){
                temp+=el%10;
                el/=10;
            }
            dsum+=temp;
        }
        return Math.abs(dsum-esum);
    }
}