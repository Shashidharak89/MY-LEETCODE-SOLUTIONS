class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length();
        for(int i=0;i<n;i++){
            char ch=sb.charAt(n-1-i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sb.deleteCharAt(n-1-i);
            }
            else{
                break;
            }
        }
        return sb.toString();

    }
}