// Last updated: 7/29/2026, 6:15:23 PM
1class Solution {
2    public int countSubstrings(String s) {
3        int left = 0;
4        int right = 0;
5        int count = 0;
6
7        while (left < s.length()) {
8            for (right = left; right < s.length(); right++) {
9                if (isPalindrome(s.substring(left, right + 1))) {
10                    count++;
11                }
12            }
13            left++;
14        }
15
16        return count;
17    }
18
19    public boolean isPalindrome(String s) {
20        int left = 0;
21        int right = s.length() - 1;
22
23        while (left < right) {
24            if (s.charAt(left) != s.charAt(right)) {
25                return false;
26            }
27            left++;
28            right--;
29        }
30
31        return true;
32    }
33}