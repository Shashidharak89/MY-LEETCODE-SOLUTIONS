class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] ord={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            set.add(getCode(words[i],ord));
        }
        return set.size();
    }
    public String getCode(String s,String[] ord){
        String t="";
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-97;
            t=t+ord[index];
        }
        return t;
    }
}