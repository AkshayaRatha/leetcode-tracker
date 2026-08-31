// Last updated: 8/31/2026, 2:06:43 PM
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        if (n == 0) {
4            return 1;
5        }
6        int total = 10;
7        int prod = 9;
8        for (int i = 2; i < n + 1; i++) {
9            total += prod * (11 - i);
10            prod *= 11 - i;
11        }
12        return total;
13    }
14}