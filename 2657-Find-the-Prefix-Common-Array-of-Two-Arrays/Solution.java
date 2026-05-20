class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int n=A.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            list.add(B[i]);
            set.add(A[i]);
            arr[i]=findCount(list,set);
        }
        return arr;
    }
    int findCount(List<Integer> list,Set<Integer> set){
        int count=0;
        for(Integer ele:list){
            if(set.contains(ele)){
                count++;
            }
        }
        return count;
    }
}