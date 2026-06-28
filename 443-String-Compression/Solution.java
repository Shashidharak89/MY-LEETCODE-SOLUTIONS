class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder("");
        int prev=0;
        sb.append(chars[0]);
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[prev]==chars[i]){
                count++;
            }
            else{
                if(count>1){
                    sb.append(String.valueOf(count));
                }
                count=1;
                prev=i;
                sb.append(chars[prev]);
            }
        }
        if(count>1){
            sb.append(String.valueOf(count));
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}