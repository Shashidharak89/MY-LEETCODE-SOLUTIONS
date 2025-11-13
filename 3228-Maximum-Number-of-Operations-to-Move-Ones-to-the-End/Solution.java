class Solution {
    public int maxOperations(String s) {
        int count=0;
        int ans=0;
        char prev='\0';
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else if(s.charAt(i)=='0' && prev!='0'){
                ans+=count;
            }
            prev=s.charAt(i);
        }
        return ans;
    }
}