import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int maxlen=0,start,end;
        start=0;
        int n=height.length;
        int val;
        end=n-1;
        while(start<end){
            val=Math.min(height[start],height[end])*(end-start);
            if(height[start]<height[end])
                start++;
            else
                end--;
            maxlen=Math.max(val,maxlen);
        }
        return maxlen;
    }
}