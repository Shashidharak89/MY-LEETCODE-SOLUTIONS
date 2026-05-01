class Solution {
    public int smallestNumber(int n) {
        if(n>511){
            return 1023;
        }
        else if(n>255){
            return 511;
        }
        else if(n>127){
            return 255;
        }
        else if(n>63){
            return 127;
        }
        else if(n>31){
            return 63;
        }
        else if(n>15){
            return 31;
        }
        else if(n>7){
            return 15;
        }
        else if(n>3){
            return 7;
        }
        else if(n>1){
            return 3;
        }
        return 1;
    }
}