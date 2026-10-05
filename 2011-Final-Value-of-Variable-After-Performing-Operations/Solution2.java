class Solution {
    public int finalValueAfterOperations(String[] operations) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("++X", 1);
        map.put("X++", 1);
        map.put("--X", -1);
        map.put("X--", -1);
        int x = 0;
        for (String op : operations) {
            x = x + map.get(op);
        }
        return x;
    }
}