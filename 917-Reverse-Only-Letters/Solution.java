class Solution {
    public String reverseOnlyLetters(String s) {
        int st=0,end=s.length()-1;
        String t="";
        char arr[]=s.toCharArray();
        while(st<end){
           
            if(!((arr[st]<='z' && arr[st]>='a') || (arr[st]<='Z' && arr[st]>='A') )){
                st++;
                 System.out.println(st);
                continue;
            }
            if(!((arr[end]<='z' && arr[end]>='a') || (arr[end]<='Z' && arr[end]>='A') ) ){
                end--;
                 System.out.println(end);
                continue;
            }
            char temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return new String(arr);
    }
}