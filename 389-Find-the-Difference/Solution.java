class Solution {
    public char findTheDifference(String s, String t) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String str=String.valueOf(ch);
            t=t.replaceFirst(str,"");
        }
        return t.charAt(0);
    }
}