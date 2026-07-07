class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg=sum/k;
        System.out.println(sum);
        for(int i=1;i<nums.length-k+1;i++){
            sum-=nums[i-1];
            sum+=nums[i+k-1];
            avg=Math.max(avg,sum/k);
        }
        return avg;
    }
}