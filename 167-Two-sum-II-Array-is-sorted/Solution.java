import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        int sum=0;
        while(start<end){
            sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }
            while(numbers[start]+numbers[end]>target){
                end--;
            }
            while(numbers[start]+numbers[end]<target){
                start++;
            }
        }
        return new int[0];
    }
}