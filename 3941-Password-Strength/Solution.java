class Solution {
    public int passwordStrength(String password) {
        Set<Character> set=new HashSet<>();
        for(char ch:password.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(Character c:set){
            if(c>='a' && c<='z'){
                count=count+1;
            }
            else if(c>='A' && c<='Z'){
                count=count+2;
            }
            else if(c>='0' && c<='9'){
                count=count+3;
            }else{
                count=count+5;
            }
        }
        return count;
    }
}