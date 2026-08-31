// Last updated: 8/31/2026, 2:45:58 PM
1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        HashMap<Integer, int[]> map = new HashMap<>();
4        int degree = 0;
5        for (int i = 0; i < nums.length; i++) {
6            int num = nums[i];
7            if (!map.containsKey(num)) {
8                map.put(num, new int[]{i, i, 1});
9            } else {
10                int[] arr = map.get(num);
11                arr[1] = i;
12                arr[2]++;
13            }
14            degree = Math.max(degree, map.get(num)[2]);
15        }
16        int minLen = nums.length;
17        for (int key : map.keySet()) {
18            int[] arr = map.get(key);
19            if (arr[2] == degree) {
20                minLen = Math.min(minLen, arr[1] - arr[0] + 1);
21            }
22        }
23        return minLen;
24    }
25}