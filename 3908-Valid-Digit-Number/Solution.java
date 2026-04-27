class Solution {
    public boolean validDigit(int n, int x) {
        if(n<10){
            return false;
        }
        String s=String.valueOf(n);

        if(s.charAt(0)==(x+'0')){
            return false;
        }
        if(s.contains(String.valueOf(x))){
            return true;
        }
        return false;
    }
}