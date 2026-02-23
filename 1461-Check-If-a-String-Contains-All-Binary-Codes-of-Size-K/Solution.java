class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=(int)Math.pow(2,k);
        Set<String> set=new HashSet<>();
        
        for(int i=0;i<s.length()-k;i++){
            String a="";
          for(int j=i;j<k+i;j++){
            a=a+s.charAt(j);
          }
          set.add(a);
        }

        if(set.size()==n){
            return true;
        }
        return false;
    }

}