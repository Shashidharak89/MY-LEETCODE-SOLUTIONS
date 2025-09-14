import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty() ){
            return true;
        }
        int a=0,i=0;

     for(i=0;i<t.length();i++){
        
        if(s.charAt(a)==t.charAt(i)){
            a++;
        }
        if(a==s.length()){
            return true;
        }
     }

      return false;
        
    }
}