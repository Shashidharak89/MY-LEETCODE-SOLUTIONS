class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new TreeSet<>();
        for(Integer ele:bulbs){
            if(set.contains(ele)){
                set.remove(ele);
            }
            else{
                set.add(ele);
            }
        }
        for(Integer bulb:set){
            list.add(bulb);
        }
        return list;
    }
}