class Solution {
    public int hammingWeight(int n) {
        String b=getBinary(n);
        int count=0;
        for(char c:b.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
    String getBinary(int n){
        if(n==0){
            return "0";
        }
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        return binary;
    }
}