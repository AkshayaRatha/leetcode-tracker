// Last updated: 8/12/2026, 1:57:42 PM
1class Solution {
2    public int hammingWeight(int n) {
3        int oneBits = 0;
4        
5        
6        while (n > 0) {
7            oneBits += n % 2;
8            n = Math.floorDiv(n, 2);
9        }
10        
11        
12        return oneBits;
13    }
14}