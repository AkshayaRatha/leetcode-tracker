// Last updated: 8/12/2026, 6:03:33 PM
1class Solution {
2    //Using Lagrange’s Four-Square Theorem
3    public boolean isSquare(int n) {
4        int x = (int) Math.sqrt(n);
5        return x * x == n;
6    }
7    public int numSquares(int n) {
8        if (isSquare(n)) return 1;
9        for (int i = 1; i * i <= n; i++) {
10            if (isSquare( n - i * i)) return 2;
11        }
12        int m = n;
13        while ((m & 3) == 0) m = m >> 2;
14        if ((m & 7) == 7) return 4;
15        return 3;
16    }
17}