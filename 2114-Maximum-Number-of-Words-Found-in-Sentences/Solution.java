class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxwords=0,count=0;
        int i,n=sentences.length,j=0;
        for(i=0;i<n;i++){
            count=0;
            for(j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            if(count+1>maxwords){
                maxwords=count+1;
            }
        }
        return maxwords;
    }
}