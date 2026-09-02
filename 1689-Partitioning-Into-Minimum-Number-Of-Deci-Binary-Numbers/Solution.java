class Solution {
    public int minPartitions(String n) {
        char num='1';
        for(char c:n.toCharArray()){
            if(c>num){
                num=c;
            }
        }
        return num-'0';
    }
}