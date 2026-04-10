class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3){
            return -1;
        }
         int i,j,k;
        List<Integer> list=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                for(k=0;k<nums.length;k++){
                    if(i!=j && j!=k && k!=i){
                    if(nums[i]==nums[j] && nums[j]==nums[k] && nums[k]==nums[i]){
                        list.add(Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i));
                    }
                    }
                }
            }
        }
        if(list.size()==0){
            return -1;
        }
        return Collections.min(list);
    }
}