class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int num1=s.charAt(i)-'0';
            int num2=s.charAt(i+1)-'0';
            if(Math.abs(num2-num1)>2){
                return false;
            }
        }
        return true;
    }
}