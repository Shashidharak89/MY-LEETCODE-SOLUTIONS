class Solution {
    public int largestAltitude(int[] gain) {
        int prefix=0,max=0;
        for(int i=0;i<gain.length;i++){
            prefix=prefix+gain[i];
            if(prefix>max){
                max=prefix;
            }
        }
        return max;
    }
}