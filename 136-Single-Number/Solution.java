class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        int ans=0;
        for(Integer ele:set){
            ans=ele;
        }
        return ans;
    }
}