class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        List<Integer> list=new ArrayList<>();
        int st=startIndex;
        int n=words.length;
        int i;
        for(i=0;i<n;i++){
            int index=st%n;
            if(words[index].equals(target)){
                list.add(i);
            }
            st++;
        }
        st=startIndex;
        for(i=0;i<n;i++){
            int index=(st+n)%n;
            if(words[index].equals(target)){
                list.add(i);
            }
            st--;
        }

        if(list.size()==0){
            return -1;
        }
        int min=Collections.min(list);
        return min;
    }
}