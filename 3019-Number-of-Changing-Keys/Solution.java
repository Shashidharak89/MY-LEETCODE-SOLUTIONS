class Solution {
    public int countKeyChanges(String s) {
        if(s.length()<=1){
            return 0;
        }
        String temp=s.toLowerCase();
        int i,count=0;
        for(i=0;i<s.length()-1;i++){
            if(temp.charAt(i)!=temp.charAt(i+1)){
                count++;
            }
        }
        return count;

    }
}