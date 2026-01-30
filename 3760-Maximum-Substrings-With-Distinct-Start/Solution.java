class Solution {
    public int maxDistinct(String s) {
        int arr[]=new int[26];
        int i;
        for(i=0;i<s.length();i++){
            int num=s.charAt(i)-'a';
            arr[num]=1;
        }
        int count=0;
        for(i=0;i<26;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}