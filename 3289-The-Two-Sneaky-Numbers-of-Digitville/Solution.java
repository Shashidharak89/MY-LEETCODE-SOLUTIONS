class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[2];
        int i=0;
        for(Integer key:map.keySet()){
            if(map.get(key)==2){
                arr[i++]=key;
            }
        }
        return arr;
    }
}