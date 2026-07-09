// Last updated: 7/9/2026, 9:15:28 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int flag=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
               flag=1;
            }
        }
        if(flag!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}