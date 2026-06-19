class Solution {
    public int largestAltitude(int[] gain) {
        int prefix[]=new int[gain.length+1];
        prefix[0]=0;
        for(int i=0;i<gain.length;i++){
            prefix[i+1]=prefix[i]+gain[i];
        }
        int max=0;
        for(int i=0;i<prefix.length;i++){
            if(prefix[i]>max){
                max=prefix[i];
            }
        }
        return max;
    }
}