class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            else
                map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        }
        int constant = 0;
        int vowel = 0;
        for (Character ele : map1.keySet()) {
            if (map1.get(ele) > vowel) {
                vowel = map1.get(ele);
            }
        }
        for (Character ele : map2.keySet()) {
            if (map2.get(ele) > constant) {
                constant = map2.get(ele);
            }

        }
        return constant+vowel;
    }
}