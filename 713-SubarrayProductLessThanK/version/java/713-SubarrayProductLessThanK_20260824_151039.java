// Last updated: 8/24/2026, 3:10:39 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int n = nums.length;
4        int ans = 0;
5
6        for (int i = 0; i < n; i++) 
7        {
8            int product = 1;
9            for (int j = i; j < n; j++) 
10            {
11                product *= nums[j];
12                if (product < k) 
13                {
14                    ans++;
15                } 
16                else 
17                {
18                    break;
19                }
20            }
21        }
22        return ans;
23    }
24}