class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int visited[] = new int[n];
        int count = 0;
        Queue<Integer> q = new LinkedList<>();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int num = isConnected[i][j];
                if (num == 1) {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] != 1) {
                count++;
                q.add(i);
                while (!q.isEmpty()) {
                    int temp = q.poll();
                    for (Integer it : list.get(temp)) {
                        if (visited[it] != 1) {
                            visited[it] = 1;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return count;
    }
}