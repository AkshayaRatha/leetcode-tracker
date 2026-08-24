// Last updated: 8/24/2026, 5:48:16 PM
1class Solution {
2    public int findLength(int[] nums1, int[] nums2) {
3        int dp[][] = new int [nums1.length][nums2.length];
4        for(int ar[] : dp){
5            Arrays.fill(ar,-1);
6        }
7        int ans=0;
8        for(int i=0;i<nums1.length;i++){
9            for(int j=0;j<nums2.length;j++){
10                if(nums1[i]==nums2[j]){
11                    ans=Math.max(ans,helper(nums1,nums2,i,j,dp));
12                }
13            }
14        }
15        return ans;
16    }
17
18    public int helper(int nums1[], int nums2[], int i, int j, int dp[][]){
19        if(i==nums1.length || j==nums2.length){
20            return 0;
21        }
22        if(dp[i][j]!=-1){
23            return dp[i][j];
24        }
25        int ans = 0;
26        if(nums1[i]==nums2[j]){
27            ans = 1+helper(nums1,nums2,i+1,j+1,dp);
28        }
29
30        return dp[i][j]= ans;
31    }
32}