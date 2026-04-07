class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);

        }
        Collections.sort(list);
        Collections.reverse(list);
        String arr[] = new String[score.length];
        if (score.length < 3) {
            if (score.length == 2) {
                if (score[0] == list.get(0)) {
                    arr[0] = "Gold Medal";
                    arr[1] = "Silver Medal";
                } else {
                    arr[1] = "Gold Medal";
                    arr[0] = "Silver Medal";
                }
            } else {
                arr[0] = "Gold Medal";
            }
        }

        
        for (int i = 0; i < score.length; i++) {
            if (score[i] == list.get(0)) {
                arr[i]="Gold Medal";
            }
            else if(score[i] == list.get(1)){
                arr[i]="Silver Medal";
            }
            else if(score[i] == list.get(2)){
                arr[i]="Bronze Medal";
            }
            else{
                arr[i]=String.valueOf(getpos(list,score[i]));
            }

        }
        return arr;
    }
    int getpos(List<Integer> list, int ele){
        for(int i=2;i<list.size();i++){
            if(list.get(i)==ele){
                return i+1;
            }
        }
        return -1;
    }
}