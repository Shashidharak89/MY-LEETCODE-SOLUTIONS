class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
       int count=0;
       int i;
       int n=hours.length;
       for(i=0;i<n;i++){
            if(hours[i]>=target){
                count++;
            }
       } 
       return count;
    }
}