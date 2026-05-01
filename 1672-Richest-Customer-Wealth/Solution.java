class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,maxsum=0;
        int i,j;
        for(i=0;i<accounts.length;i++){
            sum=0;
            for(j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];
            }

            if(sum>maxsum){
                maxsum=sum;
            }

        }
        return maxsum;
    }
}