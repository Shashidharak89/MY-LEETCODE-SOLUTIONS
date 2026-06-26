class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a,Integer b){
                if(map.get(a)-map.get(b)==0){
                    return a<b?1:-1;
                }
                return map.get(a)-map.get(b);
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=pq.remove();
        }
        return ans;
    }
}