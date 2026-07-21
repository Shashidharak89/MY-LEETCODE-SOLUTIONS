class Trie {
    Set<String> set=new HashSet<>();
    Set<String> sub=new HashSet<>();
    public Trie() {
        
    }
    
    public void insert(String word) {
        set.add(word);
        for(int i=1;i<word.length()+1;i++){
            String str=word.substring(0,i);
            sub.add(str);
        }
    }
    
    public boolean search(String word) {
        return set.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        return sub.contains(prefix);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */