// Last updated: 7/9/2026, 9:13:51 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefixsum = new int[gain.length + 1];
        prefixsum[0] = 0;
        for (int i = 1; i <= gain.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + gain[i - 1];
        }
        int max = Integer.MIN_VALUE;
        for (int ele : prefixsum) {
            max = Math.max(max, ele);
        }
        return max;
    }
}