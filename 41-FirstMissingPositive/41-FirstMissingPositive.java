// Last updated: 7/9/2026, 9:16:46 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest = 1;
        
        for (int num : nums) {
            if (num == smallest) {
                smallest++;
            }
        }
        
        return smallest;
    }
}