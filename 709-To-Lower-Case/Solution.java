class Solution {
    public String toLowerCase(String s) {
        int i;
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(i=0;i<n;i++){
            if(s.charAt(i)<=90 && s.charAt(i)>=65){
                char temp=(char)(s.charAt(i)+32);
                sb.append(temp);
            }
            else{
                sb.append(s.charAt(i));

            }
        }
        return sb.toString();
    }
}