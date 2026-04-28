class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list =new ArrayList<>();
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        list.add(nums[0]);
        if(n==1){
            return list;
        }

        int i;
        left[0]=nums[0];
        for(i=1;i<n;i++){
            if(nums[i]>left[i-1]){
                left[i]=nums[i];
            }
            else{
                left[i]=left[i-1];
            }
        }
        right[n-1]=nums[n-1];
        for(i=1;i<n;i++){
            if(nums[n-i-1]>right[n-i]){
                right[n-i-1]=nums[n-i-1];
            }
            else{
                right[n-i-1]=right[n-i];
            }
        }
        
        for(i=1;i<n-1;i++){
            if(nums[i]>left[i-1] || nums[i]>right[i+1]){
                list.add(nums[i]);
            }
        }
        list.add(nums[n-1]);
        return list;
    }
}