class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(String a,String b){
                if(map.get(b).equals(map.get(a))){
                    return a.compareTo(b);
                }
                return map.get(b)-map.get(a);
            }
        });
        for(String s:map.keySet()){
            pq.add(s);
        }
        List<String> list=new ArrayList<>();
        System.out.println(pq);
        for(int i=0;i<k;i++){
            list.add(pq.remove());
        }
        return list;
    }
}