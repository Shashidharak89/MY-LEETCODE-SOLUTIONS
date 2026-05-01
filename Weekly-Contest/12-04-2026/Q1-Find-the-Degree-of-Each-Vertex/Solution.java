class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[j]+=matrix[i][j];
            }
        }
        return arr;
    }
}