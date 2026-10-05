class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return word;
        }
        for (int i = 0; i < (index + 1) / 2; i++) {
            char c = arr[i];
            arr[i] = arr[index - i];
            arr[index - i] = c;
        }
        return new String(arr);
    }
}