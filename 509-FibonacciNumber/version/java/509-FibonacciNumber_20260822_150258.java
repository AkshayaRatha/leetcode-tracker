// Last updated: 8/22/2026, 3:02:58 PM
1class Solution {
2    public int fib(int n) {
3        if (n <= 1) return n;
4        int a = 0, b = 1;
5        for (int i = 2; i <= n; i++) {
6            int temp = b;
7            b = a + b;
8            a = temp;
9        }
10        return b;
11    }
12}