import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
    int votes=1,i,maj=nums[0],n=nums.length;

    for(i=1;i<n;i++){
        if(nums[i]==maj){
            votes++;
        }
        else {
            votes--;
        }
        if(votes==0){
            maj=nums[i];
            votes++;
        }
    }
    return maj;
    }
}