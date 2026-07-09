// Last updated: 7/9/2026, 9:14:47 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans =new ArrayList<>();
        int n=nums.length;
        int temp[]=new int[n+1];
        for(int i:nums){
            temp[i]++;
            if(temp[i]==2)ans.add(i);
        }
        return ans;
    }
}