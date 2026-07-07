class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='0'){
                int temp=(int)ch-'0';
                sum+=temp;
                x=x*10+temp;
            }
        }
        return x*sum;
    }
}