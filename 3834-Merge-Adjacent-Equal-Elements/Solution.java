class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int n=nums.length;
        List<Long> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add((long)nums[i]);
        }
        if(list.size()<=1){
            return list;
        }
        int start=0;
        int end=1;
        while(end!=list.size()){
            if(list.size()<=1){
                return list;
            }
            if((long)list.get(start)==(long)list.get(end)){
                long temp=list.get(end);
                list.remove(end);
                list.set(start,list.get(start)+temp);
                if(start!=0){
                    start--;
                    end--;
                }
            }
            else{
                start++;
                end++;
            }
        }
        return list;
    }
}