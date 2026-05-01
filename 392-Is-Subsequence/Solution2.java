class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0,j=0;
        while(i<n){
            if(j==m){
                return false;
            }
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }

        if(i!=n){
            return false;
        }
        return true;
    }
}