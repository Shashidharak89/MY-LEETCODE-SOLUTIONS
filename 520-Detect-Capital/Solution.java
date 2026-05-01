class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
       HashMap<Integer,Integer> map=new HashMap<>(); 
        map.put(1,0);
        map.put(2,0);
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            
            if(ch<96){
                map.put(1,map.get(1)+1);
            }
            else{
                map.put(2,map.get(2)+1);
            }
        }
        if((map.get(1)>=1 && map.get(2)==0)||(map.get(2)>=1 && map.get(1)==0)){
            return true;
        }
        else if(map.get(1)==1 && word.charAt(0)<97){
            return true;
        }
        else{
            return false;
        }
    }
}