import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int i;
        for(i=0;i<n;i++){
            if((s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')&& (!st.empty() )){
                if(st.peek()=='(' && s.charAt(i)==')'){
                    st.pop();
                }
                else if(st.peek()=='[' && s.charAt(i)==']'){
                    st.pop();
                }
                else if(st.peek()=='{' && s.charAt(i)=='}'){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }

        return st.empty();
    }
}