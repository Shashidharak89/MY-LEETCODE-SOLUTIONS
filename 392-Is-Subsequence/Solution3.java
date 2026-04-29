class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,n=s.length(),j=0,m=t.length();
        while(i<n && j<m){
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
            if(ch1==ch2){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==n){
            return true;
        }
        return false;
    }
}