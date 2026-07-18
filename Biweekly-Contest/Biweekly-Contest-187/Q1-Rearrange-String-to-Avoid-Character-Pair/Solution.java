class Solution {
    public String rearrangeString(String s, char x, char y) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        int end=n-1;
        int st=0;
        char ans[]=new char[n];
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans[end--]=x;
            }
            else{
                ans[st++]=arr[i];
            }
        }
        return new String(ans);
        
    }
}