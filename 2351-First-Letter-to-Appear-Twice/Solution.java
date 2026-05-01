class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(s.charAt(i))>=2){
                return s.charAt(i);
            }
        }
       
        return s.charAt(0);
    }
}