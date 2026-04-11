class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.get(nums[i])==1){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}