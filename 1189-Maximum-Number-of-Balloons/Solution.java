class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int count = 0;
        while (true) {
            if (text.contains("b")) {
                text = text.replaceFirst("b", "");
            } else {
                break;
            }
            if (text.contains("a")) {
                text = text.replaceFirst("a", "");
            } else {
                break;
            }

            if (text.contains("l")) {
                text = text.replaceFirst("l", "");
                if (text.contains("l")) {
                    text = text.replaceFirst("l", "");
                } else {
                    break;
                }
            } else {
                break;
            }

            if (text.contains("o")) {
                text = text.replaceFirst("o", "");
                if (text.contains("o")) {
                    text = text.replaceFirst("o", "");
                } else {
                    break;
                }
            } else {
                break;
            }

            if (text.contains("n")) {
                text = text.replaceFirst("n", "");
            } else {
                break;
            }
            count++;
        }
        return count;
    }
}