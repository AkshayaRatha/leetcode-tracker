// Last updated: 9/1/2026, 4:06:02 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsetsWithDup(int[] nums) {
5        Arrays.sort(nums);
6        List<List<Integer>> result = new ArrayList<>();
7        backtrack(nums, 0, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
12        result.add(new ArrayList<>(path));
13        for (int i = start; i < nums.length; i++) {
14            if (i > start && nums[i] == nums[i - 1]) continue;
15            path.add(nums[i]);
16            backtrack(nums, i + 1, path, result);
17            path.remove(path.size() - 1);
18        }
19    }
20}