class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String s="";
        for(int i=0;i<words.length;i++){
            int w=0;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                w+=getWeight(ch,weights);
            }
            w=w%26;
            char c=(char)('z'-w);
            s=s+c;
        }
        return s;
    }
    int getWeight(char ch, int[] weights){
        int index=(int)(ch-'a');
        return weights[index];
    }
}