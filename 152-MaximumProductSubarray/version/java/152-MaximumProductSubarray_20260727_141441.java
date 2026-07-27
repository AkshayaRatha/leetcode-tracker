// Last updated: 7/27/2026, 2:14:41 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int pre = 1;
4        int suf = 1;
5        int ans = Integer.MIN_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8            if (pre == 0) pre = 1;
9            if (suf == 0) suf = 1;
10
11            pre *= nums[i];
12            suf *= nums[nums.length - 1 - i];
13
14            ans = Math.max(ans, Math.max(pre, suf));
15        }
16
17        return ans;
18    }
19}