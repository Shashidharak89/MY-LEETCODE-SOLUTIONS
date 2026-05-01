class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1){
            return true;
        }
        int zero=0,one=0;
        int i,j;
        if(s.charAt(0)=='1'){
            one++;
        }
        else{
            zero++;
        }

        for(i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i),ch2=s.charAt(i+1);
            if(ch2==ch1){
                continue;
            }
            else if(ch2=='1'){
                one++;
            }
            else{
                zero++;
            }
        }
        if(one<=1){
            return true;
        }
        return false;

    }
}