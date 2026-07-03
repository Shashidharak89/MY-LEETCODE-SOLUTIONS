class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<names.length-1;i++){
            for(int j=i+1;j<names.length;j++){
                if(heights[j]>heights[i]){
                    int t=heights[j];
                    heights[j]=heights[i];
                    heights[i]=t;
                    String temp=names[j];
                    names[j]=names[i];
                    names[i]=temp;
                }
            }
        }
        return names;
    }
}