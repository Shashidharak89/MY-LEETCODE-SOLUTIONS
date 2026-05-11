class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int num=nums[n-1-i];
            while(num!=0){
                list.add(num%10);
                num/=10;
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(list.size()-i-1);
        }
        return arr;
    }
}