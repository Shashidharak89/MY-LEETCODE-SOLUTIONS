class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
          if(!(s.contains(nums[i]))){
            s.add(nums[i]);
          }
          else{
            arr[0]=nums[i];
          }

        }
        for(int i=0;i<nums.length;i++){
            if(!(s.contains(i+1))){
                arr[1]=i+1;
            }
        }
        return arr;
    }
}