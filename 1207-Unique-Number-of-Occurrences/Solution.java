class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set=new HashSet<>();

        for(Integer key:map.keySet()){
            int ele=map.get(key);
            if(set.contains(ele)){
                return false;
            }else{
                set.add(ele);
            }
        }
        return true;
    }
}