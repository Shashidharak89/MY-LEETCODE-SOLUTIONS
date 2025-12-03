class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<>();
        int n=friends.length;
        for(int i=0;i<n;i++){
            set.add(friends[i]);
        }
        int ord[]=new int[n];
        int count=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                ord[count++]=order[i];
            }
        }

        return ord;
    }
}