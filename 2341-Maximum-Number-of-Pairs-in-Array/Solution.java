class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == nums[i] && nums[j] != -1 && nums[i] != -1) {
                pairs++;
                nums[j] = -1;
                nums[i] = -1;
            }
            j++;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                count++;
            }
        }
        int ans[] = new int[2];
        ans[0] = pairs;
        ans[1] = count;
        return ans;
    }
}