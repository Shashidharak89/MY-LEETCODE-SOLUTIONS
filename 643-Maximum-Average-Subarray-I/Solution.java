class Solution {
    public double findMaxAverage(int[] nums, int k) {
        Set<Double> set = new HashSet<>();
        double avg=0;
        for (int i = 0; i < k; i++) {
            avg=avg+nums[i];
        }
        set.add(avg/k);
        for(int i=k;i<nums.length;i++){
            avg=avg+nums[i];
            avg=avg-nums[i-k];
            set.add(avg/k);
        }
        return (double)Collections.max(set);
    }
}