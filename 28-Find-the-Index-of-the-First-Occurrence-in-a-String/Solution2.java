import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
        int i,j;
        int n=haystack.length(),m=needle.length();
        int count=0;

        for(i=0;i<=n-m;i++){
            count=0;
            for(j=0;j<m;j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }
                else{
                    count++;
                }     
            }
            if(count==m){
                    return i;
                }
        }
        return -1;
    }
}