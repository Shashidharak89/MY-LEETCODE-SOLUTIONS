import java.util.*;

//58. Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
     String f=s.trim();

     int i,count=0,n=f.length();
     for(i=1;i<=n;i++){
        if(f.charAt(n-i)==' '){
            return count;
        }
        else{
            count++;
        }
     }
     return count;
    }
}