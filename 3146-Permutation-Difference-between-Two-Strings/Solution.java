class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), i);
            map2.put(t.charAt(i), i);
        }

        int ans = 0;
        for (Character c : map1.keySet()) {
            ans = ans + Math.abs(map1.get(c) - map2.get(c));
        }
        return ans;
    }
}