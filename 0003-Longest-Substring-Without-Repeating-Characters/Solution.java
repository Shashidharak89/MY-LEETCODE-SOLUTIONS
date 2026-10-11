class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n=s.length();
        int st=0;
        while(st<n){
            int i=st;
            Set<Character> set=new HashSet<>();
            while(i<n){
                char ch=s.charAt(i);
                if(!set.contains(ch)){
                   set.add(ch);
                }
                else{
                     break;
                }
                i++;
            }
            max=Math.max(max,set.size());
            st++;
        }
        return max;
    }
}