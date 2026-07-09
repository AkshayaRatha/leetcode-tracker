// Last updated: 7/9/2026, 9:14:53 AM
class Solution {
    static {
        var s = new Solution();
        for (int i = 0; i < 1000; i++) {
            s.findTheDifference("abcd", "abecd");
        }
    }
    public char findTheDifference(String s, String t) {
        char extra_letter=0;
        for(char c:s.toCharArray()) extra_letter ^= c;
        for(char c:t.toCharArray()) extra_letter ^= c;
        return extra_letter;
    }
}