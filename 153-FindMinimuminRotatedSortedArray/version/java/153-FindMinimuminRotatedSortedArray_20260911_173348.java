// Last updated: 9/11/2026, 5:33:48 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        while(left < right) {
5            int mid = left + (right - left) / 2;
6
7            if(nums[mid] < nums[right]) {
8                right = mid;
9            } else {
10                left = mid + 1;
11            }
12        }
13
14        return nums[left];
15    }
16}