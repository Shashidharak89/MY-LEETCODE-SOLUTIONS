import java.util.*;

class Sqrt{
    public int findsqrt(int x){
        int l=0,r=x,mid;
        int ans=0;
        while(l<=r){
            mid=l+(r-1)/2;
            if((long)mid*mid>x){
                r=mid-1;
            }
            else if((long)mid*mid<x){
                ans=mid;
                l=mid+1;
            }
            else if((long)mid*mid==x){
                return mid;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Sqrt obj=new Sqrt();
        System.out.println(obj.findsqrt(16));
    }
}