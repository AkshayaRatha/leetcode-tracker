// Last updated: 8/11/2026, 3:42:43 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int[] res = new int[2];
4        Set<Integer> set = new HashSet<>();
5
6        for(int i=0;i<nums.length;i++){
7            if(set.contains(nums[i])) set.remove(nums[i]);
8            else set.add(nums[i]);
9        }
10
11        int count = 0;
12        for(int x:set){
13            res[count++] = x;
14            if(count == 2) break;
15        }
16        return res;
17    }
18}