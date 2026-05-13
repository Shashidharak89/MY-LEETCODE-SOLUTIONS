class Solution {
    public int[] scoreValidator(String[] events) {
        int ans[]=new int[2];
        for(String s:events){
            if(ans[1]==10){
                break;
            }
            if(s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("6")){
                ans[0]+=Integer.parseInt(s);
            }
            else if(s.equals("WD")|| s.equals("NB")){
                ans[0]+=1;
            }
            else if(s.equals("W")){
                ans[1]+=1;
            }
        }
        return ans;
    }
}