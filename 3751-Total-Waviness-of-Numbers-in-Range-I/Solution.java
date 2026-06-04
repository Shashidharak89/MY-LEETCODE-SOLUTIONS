class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            count=count+(getWavi(i));
        }
        return count;
    }
    int getWavi(int num){
        String val=String.valueOf(num);
        int n=val.length();
        int waviness=0;
        for(int i=1;i<n-1;i++){
            char left=val.charAt(i-1);
            char ch=val.charAt(i);
            char right=val.charAt(i+1);
            if((left>ch && right>ch)||(left<ch && right<ch)){
                waviness++;
            }
        }
        return waviness;
    }
}