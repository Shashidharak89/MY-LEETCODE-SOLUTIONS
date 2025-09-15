import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i;
        ArrayList<String> list=new ArrayList<>();
        int n=nums.length;
        for(i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<n &&nums[i+1]==nums[i]+1){
                i++;
            }
            if(start!=nums[i]){
                list.add(""+start+"->"+nums[i]);
            }
            else{
                list.add(""+start);
            }

           

        }
         return list;

    }
}