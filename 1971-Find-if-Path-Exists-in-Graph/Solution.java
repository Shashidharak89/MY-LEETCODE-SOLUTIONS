class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int visited[]=new int[n];
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int temp=q.poll();
            System.out.println(temp);
            visited[temp]=1;
            for(Integer it:list.get(temp)){
                if(visited[it]!=1){
                    q.add(it);
                    visited[it]=1;
                }
            }
        }
        if(visited[source]==visited[destination]){
            return true;
        }
        return false;
    }
}