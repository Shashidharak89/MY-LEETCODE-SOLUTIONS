class Solution {
    public List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> templist=new ArrayList<>();
        templist.add(1);
        mainlist.add(templist);
        if(numRows==1){
            return mainlist;
        }
        ArrayList<Integer> secondlist=new ArrayList<>();
        secondlist.add(1);
        secondlist.add(1);
        mainlist.add(secondlist);
        int i,j;
        if(numRows==2){
            return mainlist;
        }

        
        else{
            for(i=2;i<numRows;i++){

                ArrayList<Integer> thirdlist=new ArrayList<>();
                thirdlist.add(1);


                for(j=1;j<i;j++){
                    thirdlist.add(mainlist.get(i-1).get(j-1)+mainlist.get(i-1).get(j));
                }
                thirdlist.add(1);
                mainlist.add(thirdlist);
            }
        }
        return mainlist;
    }
}