// Last updated: 7/29/2026, 2:26:02 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        helper(nums, 0, ans);
5        return ans;
6    }
7    private void helper(int[] nums, int index, List<List<Integer>> ans){
8        if(index == nums.length){
9            List<Integer> list = new ArrayList<>();
10            for(int num : nums){
11                list.add(num);
12            }
13            ans.add(list);
14            return;
15        }
16        for(int i = index; i < nums.length; i++){
17            swap(nums, index, i);
18            helper(nums, index + 1, ans);
19            swap(nums, index, i);
20        }
21    }
22    private void swap(int[] nums, int i, int j){
23        int temp = nums[i];
24        nums[i] = nums[j];
25        nums[j] = temp;
26    }
27}