class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels=0;
        int vowels=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                vowels++;
            }
        }
        maxVowels=vowels;
        for(int i=1;i<s.length()-k+1;i++){
            if(isVowel(s.charAt(i-1))){
                vowels--;
            }
            if(isVowel(s.charAt(i+k-1))){
                vowels++;
            }
            maxVowels=Math.max(maxVowels,vowels);
        }
        return maxVowels;
    }
    boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}