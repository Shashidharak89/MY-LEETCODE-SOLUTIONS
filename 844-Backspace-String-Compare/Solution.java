class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i,j,n=s.length(),m=t.length();
       char arr1[]=s.toCharArray();
       char arr2[]=t.toCharArray();
       StringBuilder s1=new StringBuilder();
       StringBuilder s2=new StringBuilder();

       for(i=0;i<n;i++){
        if(arr1[i]=='#'){
            if(s1.length()<1){
                continue;
            }
            s1.deleteCharAt(s1.length()-1);
        }
        else{
            s1.append(arr1[i]);
        }
       }

       for(i=0;i<m;i++){
        if(arr2[i]=='#'){
            if(s2.length()<1){
                continue;
            }
            s2.deleteCharAt(s2.length()-1);
        }
        else{
            s2.append(arr2[i]);
        }
       }
        return (s1.toString()).equals((s2.toString()));
    }
}