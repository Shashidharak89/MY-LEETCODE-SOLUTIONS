class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        String t="";
        for(Character c:stack){
            t+=c;
        }
        return t;
    }
}