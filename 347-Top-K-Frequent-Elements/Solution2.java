class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return map.get(a)-map.get(b);
            }
        });
        for(Integer ele: map.keySet()){
            pq.add(ele);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int ans[]=new int[k];
        int i=0;
        for(i=0;i<k;i++){
            ans[i]=pq.remove();
        }
        return ans;
    }
}