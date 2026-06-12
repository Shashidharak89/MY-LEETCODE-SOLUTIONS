class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length<2){
            if(flowerbed[0]==0){
                n--;
                return n<=0;
            }
            else{
                return n<=0;
            }
        }
        int left = -1;
        int cur = 0;
        int right = 1;
        while (cur < flowerbed.length) {
            if (left < 0) {
                if (flowerbed[cur] == 0 && flowerbed[right] == 0) {
                    flowerbed[cur] = 1;
                    n--;
                }
            } else if (right >= flowerbed.length) {
                if (flowerbed[left] == 0 && flowerbed[cur] == 0) {
                    flowerbed[cur] = 1;
                    n--;
                }
            } 
            else if (flowerbed[left] == 0 && flowerbed[cur]==0 && flowerbed[right]==0) {
                flowerbed[cur] = 1;
                n--;
            }
            left++;
            cur++;
            right++;
        }
        return n <= 0;
    }

}