import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!(st.empty())){
                
                if(st.peek()=='[' && ch==']'){
                    st.pop();
                    continue;
                }
                else if(st.peek()=='{' && ch=='}'){
                    st.pop();
                    continue;          
                }
                else if(st.peek()=='(' && ch==')'){
                    st.pop();
                    continue;                   
                }        
                    st.push(ch);    
            }
            else{
                st.push(ch);
            }
        }
        return st.empty();
    }
}