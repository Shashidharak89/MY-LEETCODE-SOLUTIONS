class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i:nums){
           int temp=i;
           while(temp!=0){
            if(temp%10==digit){
                count++;
            }
            temp/=10;
           }
        }
        return count;
    }
}