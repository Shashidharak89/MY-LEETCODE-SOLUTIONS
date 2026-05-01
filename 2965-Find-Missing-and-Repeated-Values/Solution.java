class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[2];

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(map.containsKey(grid[i][j])){
                    // map.put(grid[i][j],map.get(grid[i][j])+1);
                    arr[0]=grid[i][j];
                }
                else{
                    map.put(grid[i][j],1);
                }
            }
        } 

        for(int i=1;i<=grid.length*grid[0].length;i++){
            if(!(map.containsKey(i))){
                arr[1]=i;
            }
        } 
        return arr;
    }
}