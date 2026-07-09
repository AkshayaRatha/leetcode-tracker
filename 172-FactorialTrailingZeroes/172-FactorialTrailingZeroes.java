// Last updated: 7/9/2026, 9:15:36 AM
class Solution {
    public int trailingZeroes(int n) {
    int res = 0;
    while (n > 0) {
        n /= 5;
        res += n;
    }
    return res;
}}