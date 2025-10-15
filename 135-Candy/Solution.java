import java.util.*;
class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr[]=new int[n];
        int i;

        for(i=0;i<n;i++){
            arr[i]=1;  
        }
        for(i=1;i<n;i++){
            if(ratings[i-1]<ratings[i]){
                arr[i]=arr[i-1]+1;
            }
        }
        for(i=1;i<n;i++){
            if(ratings[n-i-1]>ratings[n-i] && arr[n-i-1]<=arr[n-i]){
                arr[n-i-1]=arr[n-i]+1;
            }
        }
        int sum=0;
        for(i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;

    }
}