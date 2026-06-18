class Solution {
    public double angleClock(int hour, int minutes) {
       double h=hour*5;
       double m=minutes/12.0;
       h=h+m;
       if (h>=60){
            h=h-60;
       }
       double ans=minutes-h;
       ans=ans*6;
       if(ans<0){
        ans=-ans;
       }
       if(ans>180){
        ans=360-ans;
       }
       return ans;
    }
}