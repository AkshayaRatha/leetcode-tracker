// Last updated: 9/11/2026, 5:35:12 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int r = 0;
6        int c = n - 1;
7        while (r <= m - 1 && c >= 0) {
8            if (target == matrix[r][c]) {
9                return true;
10            } else if (target > matrix[r][c]) {
11                r++;
12            } else {
13                c--;
14            }
15        }
16        return false;
17    }
18}