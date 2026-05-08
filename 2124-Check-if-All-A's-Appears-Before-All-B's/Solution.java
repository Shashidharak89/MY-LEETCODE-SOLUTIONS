class Solution {
    public boolean checkString(String s) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a=Math.max(a,i);
            }
            else{
                b=Math.min(b,i);
            }
        }
        if(a<b){
            return true;
        }
        return false;
    }
}