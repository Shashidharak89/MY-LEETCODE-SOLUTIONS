class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        int i;
        int n=strs.length;
        for(i=0;i<n;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String newString= new String(ch);
            if(map.containsKey(newString)){
                map.get(newString).add(strs[i]);
            }
            else{
                List<String> m=new ArrayList<>();
                m.add(strs[i]);
                map.put(newString,m);
            }
        }

        List<List<String>> ans=new ArrayList<>();
        Set<String> keys=map.keySet();
      
        for(String key:keys){

            List<String> extra=new ArrayList<>();
            for(String s:map.get(key)){
                extra.add(s);
                
            }
            ans.add(extra);
            
        }
        return ans;
    }
}