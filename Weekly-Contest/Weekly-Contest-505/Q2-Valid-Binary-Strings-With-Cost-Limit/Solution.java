class Solution {
    public List<String> generateValidStrings(int n, int k) {
        int len=(int)Math.pow(2,n);
        List<String> list=calc(len,k,n);
        List<String> ans=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String str=list.get(i);
            if(countOnes(str,k)){
                ans.add(str);
            }
        }
        return ans;
    }

    List<String> calc(int len,int k,int n){
        List<String> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            String s=Integer.toBinaryString(i);
            s=balance(s,n);
            list.add(s);
        }
        return list;
    }
    String balance(String s, int len){
        while(s.length()<len){
            s="0"+s;
        }
        return s;
    }
    boolean countOnes(String str,int k){
        int count=0;
        int st=0,end=1;
        while(st<str.length()-1 && end<str.length()){
            if(str.charAt(st)=='1' && str.charAt(end)=='1'){
                return false;
            }
            st++;
            end++;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count+=i;
            }
        }
        if(count<=k){
            return true;
        }
        return false;
    }
}