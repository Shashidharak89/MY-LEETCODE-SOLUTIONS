import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String st=strs[0];

        for(String s:strs){
            if(s.length()<st.length()){
                st=st.substring(0,s.length());
            }
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)==s.charAt(i)){
                    continue;
                }
                else{
                    st=st.substring(0,i);
                    break;
                }

            }
        }
        return st;

    }
}