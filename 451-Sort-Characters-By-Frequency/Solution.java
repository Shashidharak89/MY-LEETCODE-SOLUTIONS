class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Character c1, Character c2 ){
                return map.get(c2)-map.get(c1);
            }
        });
        for(Character c:map.keySet()){
            pq.add(c);
        }

        String t="";
        while(!pq.isEmpty()){
            char element=pq.poll();
            int ct=map.get(element);
            while(ct!=0){
                t+=element;
                ct--;
            }
        }
        return t;
    }
}