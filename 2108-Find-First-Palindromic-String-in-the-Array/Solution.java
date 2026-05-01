class Solution {
    public String firstPalindrome(String[] words) {
        String str="";
        int n=words.length;
        int i,j;
        boolean flag=false;

        for(i=0;i<n;i++){
            int l=words[i].length();
            for(j=0;j<=l/2;j++){
                if(words[i].charAt(j)==words[i].charAt(l-j-1)){
                    str=words[i];
                    flag=true;
                }
                else{
                    str="";
                    flag=false;
                    break;
                }
            }
            if(flag){
                return str;
            }
        
        }
        return str;
    }
}