// Last updated: 7/9/2026, 9:17:10 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < m; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return ans.toString();
                }
            }
            ans.append(ch);
        }

        return ans.toString();
    }
}