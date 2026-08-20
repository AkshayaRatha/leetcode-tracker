// Last updated: 8/20/2026, 1:52:21 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        Set<Integer> repeated = new HashSet<>();
4        for (int i = 0; i < nums.length; i++) {
5            if (repeated.contains(nums[i])) {
6                return nums[i];
7            }
8            repeated.add(nums[i]);
9        }
10        return -1;
11    }
12}