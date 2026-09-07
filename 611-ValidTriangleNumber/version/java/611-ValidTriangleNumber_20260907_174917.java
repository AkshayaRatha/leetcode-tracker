// Last updated: 9/7/2026, 5:49:17 PM
1import java.util.Arrays;
2class Solution {
3    public int triangleNumber(int[] sides) {
4        Arrays.sort(sides);
5        int totalTriangles = 0;
6        for (int longest = sides.length - 1; longest >= 2; longest--) {
7            int left = 0;
8            int right = longest - 1;
9            while (left < right) {
10                if (sides[left] + sides[right] > sides[longest]) {
11                 totalTriangles += (right - left);
12                    right--;
13                } else {
14                    left++;
15                }
16            }
17        }
18       return totalTriangles;
19    }
20}