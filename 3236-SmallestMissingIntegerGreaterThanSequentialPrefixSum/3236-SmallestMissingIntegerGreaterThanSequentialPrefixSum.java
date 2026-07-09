// Last updated: 7/9/2026, 9:13:44 AM
class Solution {
    public int missingInteger(int[] nums) {
        int pSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) break;
            pSum += nums[i];
        }
        Set<Integer> set = toSet(nums);
        while (true) {
            if (!set.contains(pSum)) return pSum;
            pSum++;
        }
    }

    private Set<Integer> toSet(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i : nums) set.add(i);
        return set;
    }
}