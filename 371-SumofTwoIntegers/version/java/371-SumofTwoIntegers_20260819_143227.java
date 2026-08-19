// Last updated: 8/19/2026, 2:32:27 PM
1class Solution {
2    public int getSum(int a, int b) {
3       return (b == 0) ? a : getSum(a ^ b, (a & b) << 1); 
4    }
5}