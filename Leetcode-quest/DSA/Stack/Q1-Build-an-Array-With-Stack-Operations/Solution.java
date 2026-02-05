class Solution {
    public List<String> buildArray(int[] target, int n) {
        int count=0;
        int i;
        List<String> list=new ArrayList<>();
        int temp=0;
        for(i=-1;i<target.length-1;i++){
            temp=target[i+1]-temp;
            for(int j=0;j<temp-1;j++){
                list.add("Push");
                list.add("Pop");
            }

            list.add("Push");
            temp=target[i+1];
        }
        return list;
    }
   
}