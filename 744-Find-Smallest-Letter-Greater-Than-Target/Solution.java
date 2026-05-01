class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i;
        for(i=0;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
    }
}