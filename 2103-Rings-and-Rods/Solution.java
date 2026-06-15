class Solution {
    public int countPoints(String rings) {
        HashMap<Character,Set<Character>> map=new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            char c1=rings.charAt(i);
            char c2=rings.charAt(i+1);
            if(map.containsKey(c2)){
                map.get(c2).add(c1);
            }
            else{
                Set<Character> set=new HashSet<>();
                set.add(c1);
                map.put(c2,set);
            }
        }
        int count=0;
        for(Character key:map.keySet()){
           if( map.get(key).size()>=3){
            count++;
           }
        }
        return count;
    }
}