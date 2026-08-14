// Last updated: 8/14/2026, 2:17:27 PM
1class Solution {
2    public int maxRotateFunction(int[] nums) {
3        int n = nums.length;
4
5        long total = 0;
6        for (int x : nums) total += x;
7
8        long[] dp = new long[n];
9
10        long f = 0;
11        for (int i = 0; i < n; i++) {
12            f += (long)i * nums[i];
13        }
14
15        dp[0] = f;
16
17        for (int i = 1; i < n; i++) {
18            dp[i] = dp[i - 1] + total - (long)n * nums[n - i];
19        }
20
21        long res = dp[0];
22        for (int i = 1; i < n; i++) {
23            res = Math.max(res, dp[i]);
24        }
25
26        return (int)res;
27    }
28}