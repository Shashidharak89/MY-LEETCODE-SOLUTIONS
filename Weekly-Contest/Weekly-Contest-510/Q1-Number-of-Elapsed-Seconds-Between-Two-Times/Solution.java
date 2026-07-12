class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hour1 = Integer.parseInt(startTime.substring(0, 2));
        int hour2 = Integer.parseInt(endTime.substring(0, 2));

        int minute1 = Integer.parseInt(startTime.substring(3, 5));
        int minute2 = Integer.parseInt(endTime.substring(3, 5));

        int second1 = Integer.parseInt(startTime.substring(6, 8));
        int second2 = Integer.parseInt(endTime.substring(6, 8));

        int totalsec1=(hour1*3600)+(minute1*60)+(second1);
        int totalsec2=(hour2*3600)+(minute2*60)+(second2);
        
        return totalsec2-totalsec1;

    }
}