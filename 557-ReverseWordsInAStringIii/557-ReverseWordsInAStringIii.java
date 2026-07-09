// Last updated: 7/9/2026, 9:14:30 AM
class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;

        for (int i = 0; i < len; i++) {
            int start = i;

            while (i < len && chars[i] != ' ') {
                i++;
            }

            int end = i - 1;

            while (start < end) {
                char tmp = chars[start];
                chars[start++] = chars[end];
                chars[end--] = tmp;
            }
        }

        return new String(chars);
    }
}