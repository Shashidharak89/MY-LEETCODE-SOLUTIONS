class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        for(char ch:s.toCharArray()){
            if(ch=='A'){
                a++;
            }
        }
        for(int i=1;i<s.length()-1;i++){
            char c=s.charAt(i);
            char prev=s.charAt(i-1);
            char next=s.charAt(i+1);
            if(c=='L' && prev=='L' && next=='L'){
                l=1;
            }
        }
        if(l<1 && a<2){
            return true;
        }
        return false;
    }
}