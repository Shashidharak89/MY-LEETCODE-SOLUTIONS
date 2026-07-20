class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int total=n*m;
        k=k%total;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<m;j++){
                int index=(m*i)+j-k;
                if(index<0){
                    index=total+index;
                }
                int ele=grid[index/m][index%m];
                l.add(ele);
            }
            list.add(l);
        }
        return list;
    }
}