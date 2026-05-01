import java.util.*;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int i;
        int forward[]=new int[n];
        int backward[]=new int[n];
        int output[]=new int[n];
        int prod=1,prodrev=1;
        for(i=0;i<n;i++){
            prod=prod*nums[i];
            forward[i]=prod;
            prodrev=prodrev*nums[n-i-1];
            backward[n-i-1]=prodrev;
        }
        for(i=0;i<n;i++){
            if(i==0){
                output[i]=backward[i+1];

            }
            else if(i==n-1){
                output[i]=forward[i-1];
            }
            else{
                output[i]=forward[i-1]*backward[i+1];
            }
        }
        return output;
    }
}