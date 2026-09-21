class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        for (String ele : timePoints) {
            int hour = Integer.parseInt(ele.substring(0, 2));
            int minute = Integer.parseInt(ele.substring(3, 5));
            int total = (hour * 60) + minute;
            list.add(total);
        }
        Collections.sort(list);
        int min = list.get(1) - list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) < min) {
                min = list.get(i + 1) - list.get(i);
            }
        }
        if (list.get(0) + 1440 - list.get(list.size() - 1) < min) {
            return list.get(0) + 1440 - list.get(list.size() - 1);
        }
        return min;
    }
}