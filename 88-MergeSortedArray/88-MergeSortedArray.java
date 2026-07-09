// Last updated: 7/9/2026, 9:16:11 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m; i<m+n; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        return;
    }
}