class Solution {
    public int vowelConsonantScore(String s) {
        int vowel=0;
        int chars=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                vowel++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                chars++;
            }
        }
        if(chars==0){
            return 0;
        }
        return vowel/chars;
    }
}