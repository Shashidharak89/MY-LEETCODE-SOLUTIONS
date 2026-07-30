class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        int count=0;
        for(char c : key.toCharArray()){
            if(!map.containsKey(c) && c!=' '){
                char ch=(char)('a'+(count++));
                map.put(c,ch);
            }
        }
        String str="";
        for(char c:message.toCharArray()){
            if(c==' '){
                str+=" ";
            }
            else{
                str+=map.get(c);
            }
        }
        return str;
    }
}