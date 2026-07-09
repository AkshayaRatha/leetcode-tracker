// Last updated: 7/9/2026, 9:13:47 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long currentStreak = 0;
        
        for (int num : nums) {
            if (num == 0) {
                currentStreak++;
                ans += currentStreak;
            } else {
                currentStreak = 0;
            }
        }
        return ans;
    }
}