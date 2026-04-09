class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(!map.containsKey(list1[i]) && list1[i].equals(list2[j])){
                    map.put(list1[i],i+j);
                    break;
                }
            }
        }
        List<String> list=new ArrayList<>();
        int min=Collections.min(map.values());
        for(String str:map.keySet()){
            if(map.get(str)==min){
                list.add(str);
            }
        }
       String arr[]=new String[list.size()];
       int c=0;
        for(String s : list){
            arr[c++]=s;
        }
        return arr;
    }
}