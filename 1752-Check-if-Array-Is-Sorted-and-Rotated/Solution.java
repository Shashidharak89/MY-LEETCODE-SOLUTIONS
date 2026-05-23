class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            boolean sorted=true;
            for(int j=i;j<n+i-1;j++){
                int index=j%n;
                int next=(j+1)%n;
                if(nums[index]>nums[next]){
                    sorted=false;
                }
            }
            if(sorted==true){
                return true;
            }
        }
        return false;
    }
}