class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        char c=s.charAt(0);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==c){
                return false;
            }
            c=s.charAt(i);
        }
        return true;
    }
}