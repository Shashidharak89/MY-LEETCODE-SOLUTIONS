class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            int maxele=0;
            for(int j=0;j<n;j++){
                int temp=getMax(grid[j]);
                if(temp>maxele){
                    maxele=temp;
                }
            }
            max+=maxele;
        }
        return max;

    }

    int getMax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = 0;
                break;
            }
        }
        return max;
    }
}