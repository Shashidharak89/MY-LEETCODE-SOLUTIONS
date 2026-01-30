class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int i,j,k;
        for(i=0;i<nums.length-2;i++){
            for(j=i+1;j<nums.length-1;j++){
                if(nums[j]-nums[i]==diff){
                    for(k=j+1;k<nums.length;k++){
                        if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}