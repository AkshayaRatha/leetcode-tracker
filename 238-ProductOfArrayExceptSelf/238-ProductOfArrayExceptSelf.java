// Last updated: 7/9/2026, 9:15:21 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1 ;
        int ans[] = new int [nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = pre ;
            pre*=nums[i];
        }
        int suf = 1 ;
        for(int i = nums.length -1 ; i>= 0 ; i--){
            ans[i] *= suf;
            suf*=nums[i];
        }
        return ans ;
    }
}