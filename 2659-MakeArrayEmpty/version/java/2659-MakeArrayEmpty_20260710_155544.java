// Last updated: 7/10/2026, 3:55:44 PM
1class Solution {
2    public long countOperationsToEmptyArray(int[] nums) {
3    HashMap<Integer,Integer> map = new HashMap<>();
4    int n=nums.length;
5    for(int i=0;i<n;i++)map.put(nums[i],i);
6    Arrays.sort(nums);
7    long ans=1;
8    for(int i=n-2;i>=0;i--){
9        ans += (map.get(nums[i])>map.get(nums[i+1]))?n-i:1;
10    }return ans;
11}
12}