// Last updated: 7/9/2026, 9:14:42 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int sLen = s.length();

        for (int i = 1; i <= sLen / 2; i++) {
            if (sLen % i == 0 && s.substring(0, i).repeat(sLen / i).equals(s)) {
                return true;
            }
        }

        return false;
    }
}