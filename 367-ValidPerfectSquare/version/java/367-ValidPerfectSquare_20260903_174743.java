// Last updated: 9/3/2026, 5:47:43 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int left = 1, right = num;
4        while (left <= right) {
5            int mid = (left + right)/2;
6            long midSquare = (long) mid * mid;
7            if (midSquare == num) return true;
8            else if (midSquare > num) right = mid - 1;
9            else {
10                left = mid + 1;
11            }
12        }
13        return false;
14    }
15}